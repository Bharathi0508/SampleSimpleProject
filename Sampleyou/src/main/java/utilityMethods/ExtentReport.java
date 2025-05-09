package utilityMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public void generateReport() {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReportlog");
		ExtentReports genReport = new ExtentReports();
		genReport.attachReporter(reporter);
		
		ExtentTest test = genReport.createTest("LoginTest", "Checks the login page with valid UN and Pwd");
		
	}

}
