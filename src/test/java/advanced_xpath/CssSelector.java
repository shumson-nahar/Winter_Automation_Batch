package advanced_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static WebDriver driver;


	public static void main(String[] args) {


	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.rediff.com/");
	driver.findElement(By.cssSelector("a.signin")).click();
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	
	}

}
