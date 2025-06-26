package utilityMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	    private static ExtentReports extent;
	    private static ExtentTest test;

	    public static ExtentReports getExtentReports() {
	        if (extent == null) {
	            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./test-output/ExtentReport.html");
	            extent = new ExtentReports();
	            extent.attachReporter(sparkReporter);

	            extent.setSystemInfo("OS", "Windows");
	            extent.setSystemInfo("Tester", "Bharathi");
	        }
	        return extent;
	    }

	    public static ExtentTest createTest(String testName) {
	        test = getExtentReports().createTest(testName);
	        return test;
	    }

	    public static void flushReport() {
	        if (extent != null) {
	            extent.flush();
	        }
	    }
	}

	


