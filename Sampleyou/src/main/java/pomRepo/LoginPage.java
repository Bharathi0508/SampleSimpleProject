package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {

	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
		@FindBy( xpath = "//input[@id = \"Email\"]") 
		private  WebElement EmailID;
		
		@FindBy( xpath = "//input[@id = \"Password\"]") 
		private WebElement Password;
		
		
		public WebElement getEmailID() {
			return EmailID;
		}

		public void setEmailID(String emailID) {
			EmailID.sendKeys(emailID);
		}

		public WebElement getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password.sendKeys(password);
		}
		
	}


