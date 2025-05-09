package utilityMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutor {
	
	public void javaScriptExecutor(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");
	}
	

}
/*🔹 Common JavaScriptExecutor Snippets
Task	JavaScriptExecutor Code
Scroll to bottom >>>>>>>>>>	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
Get page title	>>>>>>>>>>>>String title = (String) js.executeScript("return document.title;");
Highlight an element	>>>>>>>js.executeScript("arguments[0].style.border='3px solid red'", element);
Refresh page>>>>>>>>>>>>>	js.executeScript("history.go(0);");*/
