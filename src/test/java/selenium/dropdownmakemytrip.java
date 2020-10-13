package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownmakemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromeandfirefoxdriver\\chromedriver.exe");
		//System.setProperty("key", "path");
			WebDriver driver = new ChromeDriver();
			 driver.get("http://www.makemytrip.com");
			 Thread.sleep(2000);
			 
			// Actions ao = new Actions();
			 
			 driver.findElement(By.id("fromCity")).clear();
			 driver.findElement(By.id("fromCity")).sendKeys("Delhi");
			 driver.findElement(By.id("fromCity")).click();
			 
	
	}

}
