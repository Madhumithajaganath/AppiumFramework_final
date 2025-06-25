package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerImplementation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		TakesScreenshot screenshot = (TakesScreenshot)BaseClass.sdriver;
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		File dtsn = new File("failedTest "+methodName+".png");
		
		try {
			FileUtils.copyFile(scr, dtsn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
