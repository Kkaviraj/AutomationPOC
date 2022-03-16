package org.driverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.propertyFileReader.PropertyFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver;


	private static DriverManager DriverManager_inst;
	
	
	private DriverManager() {


	}

	public static DriverManager instance() {
	
		if(DriverManager_inst  == null) {
			
			DriverManager_inst = new DriverManager();
			
		}
			
		return DriverManager_inst;	
	
	}


	public void driver_init(String browser) {


		switch (browser) {

		case "chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			break;

		default:

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}


	public void browser_launch() {

		driver.get(PropertyFileReader.url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

}
