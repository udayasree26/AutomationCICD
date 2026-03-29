package testlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylisteners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Execution is started...");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution is success...");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution is failed...");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution is skipped...");
	  }
	
	public void onStart(ITestContext context) {
		System.out.println("Execution is started...");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution is finished...");
	  }


}
