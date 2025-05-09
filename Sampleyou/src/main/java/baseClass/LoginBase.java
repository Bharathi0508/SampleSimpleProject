package baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class LoginBase {
	
	@BeforeTest
	public void loginBase(WebDriver driver) {

	    driver.get("https://demowebshop.tricentis.com/login");
		Assert.assertEquals("https://demowebshop.tricentis.com/login", driver.getCurrentUrl());
		Reporter.log("Actual and current uRL are matched");
	}
	

}
