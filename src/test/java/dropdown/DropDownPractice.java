package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class DropDownPractice {
	public WebDriver driver;
	public Select select;
	

	@BeforeMethod
	public void setUp() {
	driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

}
