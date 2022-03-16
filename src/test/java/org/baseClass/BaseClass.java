package org.baseClass;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.driverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {



	private static BaseClass BaseClass_inst;


	private BaseClass() {

		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public static BaseClass instance() {


		if(BaseClass_inst == null) {

			BaseClass_inst = new BaseClass();

		}

		return BaseClass_inst;

	}


	public boolean sendKeys(WebElement element,String value) {

		element.clear();

		element.sendKeys(value);

		return true;

	}

	public boolean click(WebElement element) {

		element.click();

		return true;

	}

	public boolean contextClick(WebElement element) {

		Actions action =new Actions(DriverManager.getDriver());

		action.contextClick(element);

		return true;

	}

	public boolean doubleClick(WebElement element) {

		Actions action =new Actions(DriverManager.getDriver());

		action.doubleClick(element);

		return true;
	}

	public boolean isSelected(WebElement element) {

		element.isSelected();

		return true;

	}


	public boolean isDisplayed(WebElement element) {

		element.isDisplayed();

		return true;

	}

	public boolean isEnabled(WebElement element) {

		element.isEnabled();

		return true;

	}



	public void write_in_excel(String cellValue) {


		
		try {
			FileInputStream instream =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\AutomationTrail\\src\\test\\resources\\Book1.xlsx");
			
			HSSFWorkbook workbook =new HSSFWorkbook(instream);
			
			HSSFSheet createSheet = workbook.createSheet("EntryData");
			
			for (int i = 0; i < createSheet.getLastRowNum(); i++) {
				
				HSSFRow row = createSheet.getRow(i);
				
				HSSFCell cell = row.getCell(0);
				
				cell.setCellValue("Kaviraj");
				
				FileOutputStream outstream = new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\AutomationTrail\\src\\test\\resources\\Book1.xlsx");
				
				workbook.write(outstream);
				
				//outstream.close();
				
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		}

	}





}
