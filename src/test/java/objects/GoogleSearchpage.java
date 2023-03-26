package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	WebDriver driver;
	public GoogleSearchpage(WebDriver driver) {
		this.driver = driver;
		
	}
	By searchbox = By.xpath("//input[@name='q']");
	By Search_btn = By.xpath("(//input[@name='btnK'])[1]");
	By Facebook_link = By.linkText("Facebook - log in or sign up");
	
	public void searchgoogle(String Searchinput) {
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(2000);
			driver.findElement(Search_btn).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	
	

}
	public void ClickFacebook() {
		try {
			driver.findElement(Facebook_link).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
			
		}
	}
}
