package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.ExtentManager;
import util.ExtentTestManager;

public class TestListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult context) {
		ExtentManager.getInstance();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		ExtentTestManager.startTest(methodname);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	 ExtentTestManager.getTest().pass("Test is passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTestManager.getTest().fail("Test is failed");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ExtentTestManager.getTest().skip("Test case is skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentTestManager.flushreport();
	}

}
