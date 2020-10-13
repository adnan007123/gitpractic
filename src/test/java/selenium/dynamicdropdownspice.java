package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdropdownspice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\chromeandfirefoxdriver\\chromedriver.exe");
		//System.setProperty("key", "path");
			WebDriver driver = new ChromeDriver();
			 driver.get("http://www.spicejet.com");
	
			 driver.findElement(By.id("divpaxinfo")).click();
			 
			 WebElement oday = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
			 
			 Select sl = new Select(oday);
			 Thread.sleep(2500);
			 sl.selectByIndex(6);
			 sl.deselectByVisibleText("9");
			 
	}


	
}
