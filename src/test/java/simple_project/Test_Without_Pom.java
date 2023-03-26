package simple_project;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test_Without_Pom {
	public static  WebDriver driver;
	 public static  ChromeOptions options;

	@Test
	public void testDemo() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("userName")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	 String Heading = driver.findElement(By.xpath("//header/a[1]/img[1]")).getText();
	 //System.out.println(" Heading");
	 driver.quit();
			
	   // driver.findElement(By.id("submit")).click();
	
		

	}

}
