package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseClass.LoginBase;
import pomRepo.LoginPage;
import utilityMethods.ExtentReport;
import utilityMethods.TakeScreenShot;

public class LoginTest {
	
	@Test
	public void LoginTest() throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		ExtentTest test;
		
	 test  = ExtentReport.createTest("Login REPORT");
	 
	
		LoginBase base = new LoginBase();
		TakeScreenShot ss = new TakeScreenShot();
		LoginPage login = new LoginPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//get into the URL
		base.loginBase(driver);
		
		//sending required mailID and Pwd
		login.setEmailID("bbharathicse05@gmailcom");
		login.setPassword("Bharathi@05");
		
		//login the DemoWebShop
		driver.findElement(By.xpath("//input[@value = \"Log in\"]")).click();
		
		//TakeScreenShot
		
		ss.Snap(driver);
		
		driver.close();
		
		
	}

}
