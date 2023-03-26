package practice_tutorialninja;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Practice_Register {
	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void openBrowser() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("http://tutorialsninja.com/demo");
	}
	@Test(priority=1)
	public void verifyRegisteringAnAccountWithMandatoryFields() throws InterruptedException {
		
	
		driver.findElement(By.id("input-firstname")).sendKeys(("shumson "));
		Thread.sleep(3000);
		driver.findElement(By.id("input-lastname")).sendKeys(("Nahar"));
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("naharshumson@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-telephone")).sendKeys(("2676001308"));
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys(("Farabi123"));
		Thread.sleep(3000);
		driver.findElement(By.id("input-confirm")).sendKeys(("Farabi123"));
		
		driver.findElement(By.name("agree")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.cssSelector("input.btn.primary")).click();
}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}
