package tutorialninja_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class X_path {
	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void setUp() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("http:tutorialsninja.com/demo");
	}
	

	
	@Test(priority=1)
	public void RegisterPage() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
	
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium101");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Panda101");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda111@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("2676001308");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	@Test(priority=2)
	public void loginUsingRegisterDetails() {
	driver.findElement(By.xpath("//a[text()='My Account']")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda111@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}


	@AfterMethod
	public void tearDown() {
	driver.quit();
	}



	}


