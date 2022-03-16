package org.listnerClass;

import org.driverManager.DriverManager;
import org.propertyFileReader.PropertyFileReader;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lister implements ITestListener {



	@Override
	public void onFinish(ITestContext arg0) {

		DriverManager.getDriver().close();


	}

	@Override
	public void onStart(ITestContext result) {

		PropertyFileReader.instance().reader();

		String  browsr = result.getCurrentXmlTest().getParameter("browser");

		DriverManager.instance().driver_init(browsr);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {



	}

	@Override
	public void onTestFailure(ITestResult arg0) {



	}

	@Override
	public void onTestSkipped(ITestResult arg0) {



	}

	@Override
	public void onTestStart(ITestResult arg0) {



	}

	@Override
	public void onTestSuccess(ITestResult arg0) {



	}

}
