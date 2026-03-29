package testlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportmanager implements ITestListener{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkreporter.config().setDocumentTitle("Automation Report");
		sparkreporter.config().setReportName("Functional Testing");
		sparkreporter.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Computer Name","LocalHost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Udayasree");
		extent.setSystemInfo("OS","Windows");
		extent.setSystemInfo("Browser Name","Chrome");
	  }
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test case is Passed :"+result.getName());
	  }
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case is Failed :"+result.getName());
		test.log(Status.FAIL, "Test case is Failed due to:"+result.getThrowable());
	  }
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case is Skipped :"+result.getName());
	  }
	
	public void onFinish(ITestContext context) {
		extent.flush();
	  }


}
