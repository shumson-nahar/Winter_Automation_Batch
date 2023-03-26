package testng_automation_code;


import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class InvocationConcepts {
	 public static  WebDriver driver;
	 public static  ChromeOptions options;
	 @Test
	 public void tnDemoLogin() {
	
			ChromeOptions options = new ChromeOptions();
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.quit();
				
		
	}

}
