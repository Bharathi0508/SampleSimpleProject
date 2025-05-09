package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Radio-Buttons
	
	@FindBy(xpath = "//label[text() ='Male']")
	private WebElement gender_Male;
	
	@FindBy(xpath="//label[text() =\"Female\"]")
	private WebElement gender_Female;
	
	//to select

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
        	gender_Male.click();
        } else if (gender.equalsIgnoreCase("female")) {
        	gender_Female.click();
        }
    }

}
