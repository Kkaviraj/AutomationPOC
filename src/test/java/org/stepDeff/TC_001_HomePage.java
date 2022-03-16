package org.stepDeff;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

 
import org.driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TC_001_HomePage {
	
	@Given("As a user i want lanch the application")
	public void as_a_user_i_want_lanch_the_application() {

	
		DriverManager.instance().browser_launch();
		
		
	}

	@When("Count the total link present in the home page and find the broken links")
	public void count_the_total_link_present_in_the_home_page_and_find_the_broken_links() {

	
	List<WebElement> totallinks = DriverManager.getDriver().findElements(By.tagName("a"));
	
	System.out.println("totallinks"+ totallinks.size());
	
	for (int i =0 ; i<totallinks.size();i++) {
		
		String attribute = totallinks.get(i).getAttribute("href");
		
		try {
			
			URL url = new URL(attribute);
			
			URLConnection openConnection = url.openConnection();
			
			HttpURLConnection connection = (HttpURLConnection)openConnection;
			
			int responseCode = connection.getResponseCode();
			
			if(responseCode!=200) {
				
				System.out.println("Broken Link :" + attribute);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	}

	@When("Count the total image present in the home page and find the broken image")
	public void count_the_total_image_present_in_the_home_page_and_find_the_broken_image() {

	
	List<WebElement> totalimages = DriverManager.getDriver().findElements(By.tagName("img"));
	
	System.out.println("totalimages" + totalimages.size());
	
	for (WebElement webElement : totalimages) {
		
		String attribute = webElement.getAttribute("src");
		
		try {
			
			URL url =new URL(attribute);
			
			URLConnection openConnection = url.openConnection();
			
			HttpURLConnection connection =(HttpURLConnection)openConnection;
			
			int responseCode = connection.getResponseCode();
			
			if(responseCode!= 200) {
				
				System.out.println("Broken image :" + attribute);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
	}


}
