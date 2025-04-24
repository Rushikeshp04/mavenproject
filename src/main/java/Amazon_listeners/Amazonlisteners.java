package Amazon_listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeDriver;
=======
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
<<<<<<< HEAD
import org.testng.annotations.Listeners;
@Listeners(Amazon_listeners.Amazonlisteners.class)

public class Amazonlisteners implements ITestListener
{
      public static ChromeDriver driver;
=======

public class Amazonlisteners implements ITestListener
{
      public static WebDriver driver;
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	      TakesScreenshot ss = (TakesScreenshot) driver;
	      File Source=  ss.getScreenshotAs(OutputType.FILE);
	         File Destination = new File("C:\\Users\\rushi\\OneDrive\\Pictures\\Camera Roll\\rushikesh.png");
	try {
		FileHandler.copy(Source, Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
<<<<<<< HEAD
		TakesScreenshot ss = (TakesScreenshot) driver;
	      File Source=  ss.getScreenshotAs(OutputType.FILE);
	         File Destination = new File("C:\\Users\\rushi\\OneDrive\\Pictures\\Camera Roll\\failcase.png");
	     	try {
	    		FileHandler.copy(Source, Destination);
	    	} catch (IOException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	 }
=======
	}
>>>>>>> 3632f3323dd713e125400360630897283cb0c3a7

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
     
}
