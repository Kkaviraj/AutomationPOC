package org.revalidation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class IAnnotationTransformer implements org.testng.IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation status, Class arg1, Constructor arg2, Method arg3) {

		
		IRetryAnalyzer retryAnalyzer = status.getRetryAnalyzer();
		
		if(retryAnalyzer == null) {
			
			status.setRetryAnalyzer(Revalidation.class);
			
			
		}
	}
	
	
	
	

}
