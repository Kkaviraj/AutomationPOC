package org.revalidation;

import org.propertyFileReader.PropertyFileReader;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Revalidation implements IRetryAnalyzer   {

	
int startcount = 0;

int retrycount = 2;



@Override
public boolean retry(ITestResult result) {
	
	
	switch (PropertyFileReader.revalidation.toLowerCase()) {
	case "true":
		
		if(startcount<retrycount) {
			
			
			System.out.println("Retry Test " + result.getName() + "with status " 
			
					+ getResultStatusName(result.getStatus()) +"for the " + (startcount+1) +"time(s).");
			
			startcount++;
			return true;
		}

		break;

	default:
		break;
	}
	
	
	return false;
}


private String getResultStatusName(int status) {

	String resultName="";
	
	if(status==1) {
		
		resultName="SUCCESS";
		
	}if(status==2){
		
		resultName="FAILURE";
		
	}if(status==3){
		
		resultName="SKIP";
		
	}
	return resultName;
	
	
	
}






}
