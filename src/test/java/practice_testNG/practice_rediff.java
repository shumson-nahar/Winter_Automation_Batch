package practice_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice_rediff {
	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void setUp() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://www.rediff.com/");

}
	@Test
	public void ClickOnSignLink() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
	}
		@Test
		public void loginCredentials() {
			driver.findElement(By.className("singin")).click();
			
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		driver.findElement(By.className("signinbtn")).click();
	}
		@Test
		public void clickOnLogOutLink() {
		driver.findElement(By.className("singin")).click();
			
			
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
			
			
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		driver.findElement(By.linkText("Rediff Home")).click();
		driver.findElement(By.linkText("Feedback")).click();
		
		
	}
	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}
}
