package automation_screenshot;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screen_shots {
	WebDriver driver;
	public static ChromeOptions options;
	
	@Test
	public void checkingScreenShot() throws Exception {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	
		driver.get("http://jeevansathi.com/");
		
		
		
		WebElement logo = driver.findElement(By.cssSelector("div.middle_div.mtn606"));
        File destination = new File("C:\\Users\\Shumson Nahar\\eclipse-workspace2\\MAVEN_PROJECT\\src\\test\\Screenshot.png");

		File source = logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy( source ,destination);
		driver.close();
		

}
}




