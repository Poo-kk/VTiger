package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener{
	
	JavaUtility jUtil=new JavaUtility();
	String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	ExtentReports reports;
	ExtentTest test;
	
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"Test method execution started");
		//Logging every test methods in the Extent Report
		test=reports.createTest(methodName);
		System.out.println(methodName+"Test method execution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+" Test Method successfully executed");
		//Logging the status as PASS for Test method passed
		test.log(Status.PASS, methodName+"Test Method successfully executed");
		System.out.println(methodName+" Test Method successfully executed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"Test method execution failed");
		Reporter.log(methodName+"Test method execution failed");
		
		//Taking WebPage screenshot
		
		JavaUtility jUtil=new JavaUtility();
		String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		String screenShotName=methodName+dateTimeStamp;
		SeleniumUtility sUtil=new SeleniumUtility();
		try {
			String path=sUtil.getWebpageScreenshot(BaseClass.sDriver, screenShotName);
			test.addScreenCaptureFromPath(path);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		//Logging the status as FAIL for the test method failed
		test.log(Status.FAIL, methodName+"Test method execution failed");
		
		//Logging the INFO for test method failed
		test.log(Status.INFO, result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"Test method execution skipped");
		System.out.println(methodName+"Test method execution skipped");
	}

	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite execution started");
		//Configuration of ExtentReports
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("QA Report");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//generate an empty report & add system info
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Base OS", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Poornima");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite execution finished ");
		
		//Flushing the generated report
		reports.flush();
		
	}

}
