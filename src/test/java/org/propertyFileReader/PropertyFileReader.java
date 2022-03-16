package org.propertyFileReader;

import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {


	public static String browser;

	public static String url;
	
	public static String revalidation;


	private static PropertyFileReader PropertyFileReader_inst;
	
	
	private PropertyFileReader() {
		
	}
	
	
	public static PropertyFileReader instance() {
		
		if(PropertyFileReader_inst == null) {
			
			
			PropertyFileReader_inst = new PropertyFileReader();
		}
		
		return PropertyFileReader_inst;
		
	}
	
	
	

	public void reader() {


		Properties properties = new Properties();

		try {
			properties.load(getClass().getResourceAsStream("/GlobalProperty.properties"));

		} catch (IOException e) {

			e.printStackTrace();

		}

		browser = properties.getProperty("browser");

		url = properties.getProperty("url");
		
		revalidation = properties.getProperty("revalidation");
		
	}

}
