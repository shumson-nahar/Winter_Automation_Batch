package advanced_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Advanced_Xpath {
	


public static WebDriver driver;
public static void main (String[]args) {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://tutorialsninja.com/demo/");

	
		driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::span[contains(text(), 'My Account')]")).click();
		driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::span[contains(text(), 'My Account')]/following::ul[1]/child::li/a[contains(text(), 'Login')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@class = 'btn btn-primary' ]")).click();
		driver.findElement(By.xpath("//aside[@id = 'column-right']/descendant::a[contains(text(), 'Logout')]")).click();
		driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[text() = 'Continue']")).click();
	}
	
}
