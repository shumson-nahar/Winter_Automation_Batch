package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	WebDriver driver;
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		
	

}
	By Username_editbox = By.xpath("//input[@id='email']");
	By Password_editbox = By.id("pass");
	By Login_Btn = By.name("login");

public void EnterUsername() {
	driver.findElement(Username_editbox ).sendKeys("Testuser");
	
	
}
public void EnterPassword() {
	driver.findElement(Password_editbox).clear();
	driver.findElement(Password_editbox).sendKeys("Tester123");
}
public void VerifyLogin() {
	driver.findElement(Login_Btn).click();
	String title = driver.getTitle();
	assertEquals(title,"Login page");
}
}
