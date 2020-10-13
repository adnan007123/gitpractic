package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class handedropdownfacebook {
//	public static WebDriver driver = null;
//	public String key = "webdriver.chrome.driver";
//	public String path = "D:\\chromeandfirefoxdriver\\chromedriver.exe";
//	public static String url = "http://www.fb.com";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromeandfirefoxdriver\\chromedriver.exe");
//System.setProperty("key", "path");
	WebDriver driver = new ChromeDriver();
	 driver.get("http://www.fb.com");
	 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("addy@email.com");
	 driver.findElement(By.id("pass")).sendKeys("abcdef");
	// driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
	 
	WebElement oday = driver.findElement(By.xpath("//*[@id=\'day\']"));
	Select s1 = new Select(oday);
	Thread.sleep(2000);
	 s1.selectByIndex(4);
	 s1.selectByValue("6");
	 s1.selectByVisibleText("7");
	 
	 //getOptions() is used to get all options from the dropdown list.
	 //It takes no parameter and returns List<WebElements>.
	
	 List<WebElement> lt = s1.getOptions();
	 int size = lt.size();
	 System.out.println(size);
	 
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(i);
		  String sy = lt.get(i).getText();
		  System.out.println(sy);
		  
	  }
	 
	 
	 
		
		
		
		
		
		
		
	}

}
