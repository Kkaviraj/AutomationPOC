package org.stepDeff;

import java.util.ArrayList;
import java.util.List;

import org.baseClass.BaseClass;
import org.driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageObjects.HomePage_Elements;
import org.testng.Assert;

import com.mysql.fabric.xmlrpc.base.Array;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_002_WebTable {
	
	@When("Ensure table button in enabled and click")
	public void ensure_table_button_in_enabled_and_click() {

		
		
		
		boolean enabled = BaseClass.instance().isEnabled(HomePage_Elements.instance().getTable_btn());
		
		if(enabled==true) {
			
			BaseClass.instance().click(HomePage_Elements.instance().getTable_btn());
			
			Assert.assertTrue(true);
			
		}else {
			
			Assert.assertTrue(false);
		
		}
	}

	@Then("Find the number of columns present")
	public void find_the_number_of_columns_present() {

	
	List<WebElement> totalcolumns = DriverManager.getDriver().findElements(By.xpath("//*[@id='table_id']/tbody/tr[1]/th"));
		
	System.out.println("Total Number of columns is :" +totalcolumns.size() );

	for(int i=0 ; i< totalcolumns.size();i++) {
		
		String Title = totalcolumns.get(i).getText();
	
		
		System.out.println(Title);
	}
	
	
	}

	@When("Find the nuber of rows present")
	public void find_the_nuber_of_rows_present() {

	
		List<WebElement> totalRows = DriverManager.getDriver().findElements(By.xpath("//*[@id='table_id']/tbody/tr"));
		
		
		System.out.println("Total Number of row is :" +totalRows.size() );
	
	}

	@When("Row wise get all datas and write in the excel sheet")
	public void row_wise_get_all_datas_and_write_in_the_excel_sheet() {

	List<String> list =new ArrayList<String>();
	
		List<WebElement> Rows = DriverManager.getDriver().findElements(By.xpath("//*[@id='table_id']/tbody/tr[3]/td"));
		
		for (int i = 0; i < Rows.size(); i++) {
			
			String text = Rows.get(i).getText();
			
			list.add(text);
		
		}
		
		for (String webElement : list) {
			
			
			BaseClass.instance().write_in_excel(webElement);
		}
		
		
		
	}

}
