package utilityMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import baseClass.LoginBase;

public class TakeScreenShot {
	
	public void Snap(WebDriver driver) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ss.png");
		FileUtils.copyFile(src, dest);
		
			
	}

}
