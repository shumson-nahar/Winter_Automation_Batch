package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fabook_Practice {

public class Facebook {
	public WebDriver driver;
	public Select select;
	

	@BeforeMethod
	public void setUp() {
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void CreateNewAccount() throws InterruptedException {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("seleniumpanda111@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("seleniumpanda111@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("seleniumpanda111@gmail.com");
		// dropDown automation
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jul");

		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");

		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1965");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
}
