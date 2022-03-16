package org.runnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		
		features="src/test/resources",
		glue= {"org.stepDeff","org.hooks"},
		monochrome=true,
		dryRun=false,
		tags="@hoomePage",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class RunnerClass extends AbstractTestNGCucumberTests  {
	
	
	
	

}
