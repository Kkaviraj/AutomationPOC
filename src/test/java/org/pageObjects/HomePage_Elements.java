package org.pageObjects;

import org.driverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Elements {
	
	
	private static HomePage_Elements HomePage_Elements_inst;
	
	
	private HomePage_Elements() {
		
		PageFactory.initElements(DriverManager.getDriver(), this);
		
	}
	
	
	public static HomePage_Elements instance() {
		
		
		if(HomePage_Elements_inst == null) {
			
			HomePage_Elements_inst = new HomePage_Elements();
			
		}
	
		return HomePage_Elements_inst;
			
	}
	
	@FindBy(xpath="//h5[text()='Edit']")
	private WebElement edit_btn;
	
	@FindBy(xpath="//h5[text()='Button']")
	private WebElement button_btn;
	
	@FindBy(xpath="//h5[text()='HyperLink']")
	private WebElement hyperlink_btn;

	@FindBy(xpath="//h5[text()='Image']")
	private WebElement image_btn;
	
	@FindBy(xpath="//h5[text()='Drop down']")
	private WebElement dropdown_btn;
	
	@FindBy(xpath="//h5[text()='Radio Button']")
	private WebElement radio_btn;
	
	
	@FindBy(xpath="//h5[text()='Checkbox']")
	private WebElement checkbox_btn;
	
	@FindBy(xpath="//h5[text()='Table']")
	private WebElement table_btn;
	
	
	@FindBy(xpath="//h5[text()='Alert']")
	private WebElement alert_btn;
	
	@FindBy(xpath="//h5[text()='Frame']")
	private WebElement frame_btn;
	
	@FindBy(xpath="//h5[text()='Window']")
	private WebElement window_btn;
	
	@FindBy(xpath="//h5[text()='Calendar']")
	private WebElement calander_btn;
	
	
	@FindBy(xpath="//h5[text()='Draggable']")
	private WebElement dragable_btn;
	
	@FindBy(xpath="//h5[text()='Auto Complete']")
	private WebElement autocomplete_btn;
	
	@FindBy(xpath="//h5[text()='DownLoad Files']")
	private WebElement download_btn;
	
	@FindBy(xpath="//h5[text()='Upload Files']")
	private WebElement upload_btn;
	
	@FindBy(xpath="//h5[text()='Wait to Disappear']")
	private WebElement waitToDisappear_btn;
	
	@FindBy(xpath="//h5[text()='Wait to Appear']")
	private WebElement waitToappear_btn;
	
	@FindBy(xpath="//h5[text()='Wait for Alert']")
	private WebElement waitToalert_btn;


	public static HomePage_Elements getHomePage_Elements_inst() {
		return HomePage_Elements_inst;
	}


	public WebElement getEdit_btn() {
		return edit_btn;
	}


	public WebElement getButton_btn() {
		return button_btn;
	}


	public WebElement getHyperlink_btn() {
		return hyperlink_btn;
	}


	public WebElement getImage_btn() {
		return image_btn;
	}


	public WebElement getDropdown_btn() {
		return dropdown_btn;
	}


	public WebElement getRadio_btn() {
		return radio_btn;
	}


	public WebElement getCheckbox_btn() {
		return checkbox_btn;
	}


	public WebElement getTable_btn() {
		return table_btn;
	}


	public WebElement getAlert_btn() {
		return alert_btn;
	}


	public WebElement getFrame_btn() {
		return frame_btn;
	}


	public WebElement getWindow_btn() {
		return window_btn;
	}


	public WebElement getCalander_btn() {
		return calander_btn;
	}


	public WebElement getDragable_btn() {
		return dragable_btn;
	}


	public WebElement getAutocomplete_btn() {
		return autocomplete_btn;
	}


	public WebElement getDownload_btn() {
		return download_btn;
	}


	public WebElement getUpload_btn() {
		return upload_btn;
	}


	public WebElement getWaitToDisappear_btn() {
		return waitToDisappear_btn;
	}


	public WebElement getWaitToappear_btn() {
		return waitToappear_btn;
	}


	public WebElement getWaitToalert_btn() {
		return waitToalert_btn;
	}
	
	
	
	
	
}
