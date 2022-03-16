package org.hooks;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.driverManager.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;

public class Status {

	byte[] bs;
	
	@AfterStep
	public void result(Scenario status) {

		
		if(status.isFailed()) {
			
			
			TakesScreenshot screenshort =(TakesScreenshot)DriverManager.getDriver();
			
			File src = screenshort.getScreenshotAs(OutputType.FILE);
			
			
			try {
				
				 bs = FileUtils.readFileToByteArray(src);
				 
				 String encodeToString = "data:image/png;base64,"+Base64.getEncoder().encodeToString(bs);
				 
				 status.write("FAILED:- IMAGE ATTACHMENT");
				 
				 status.embed(bs, "image/png");
				 
				 
				 ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(encodeToString);
				 
				 
		
			} catch (IOException e) {
			
				 e.printStackTrace();
			}
					
		}
		
	}
	
}

