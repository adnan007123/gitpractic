package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromeandfirefoxdriver\\chromedriver.exe");
		//System.setProperty("key", "path");
			WebDriver driver = new ChromeDriver();
			 driver.get("http://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
				Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[@value = 'MAA'])[2]")).click();
	//use chropath 2 matching notes found need to define (2)|| for seledting chennai bcoz it has 2 entries
			 
	}

}
