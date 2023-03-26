package advanced_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tutorialninja_using_cssSelector {
	public WebDriver driver;
	public Select select;
	

	@BeforeMethod
	public void setUp() {
	driver=new ChromeDriver();
	
	driver.get("http://tutorialsninja.com/demo/");
	}
	@Test
	public void ClickOnLoginPage() {
		driver.findElement(By.cssSelector("input#input-email"))
	}
	

}
