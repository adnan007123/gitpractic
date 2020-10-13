package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromeandfirefoxdriver\\chromedriver.exe");
		//System.setProperty("key", "path");
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("http://www.amazon.com");
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			
			
			
	}

}
