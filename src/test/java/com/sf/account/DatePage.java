package com.sf.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePage extends AccountPage {
	public DatePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "ext-gen148")WebElement date_field;
	@FindBy(xpath="//div[@class='x-combo-list-item x-combo-selected']")WebElement create_date;
	@FindBy(xpath= "//img[@id='ext-gen152']")WebElement image;
	@FindBy(xpath = "//td[@title='Today']//span[contains(text(),'5')]")WebElement today;
	@FindBy(xpath="//button[@id='ext-gen49']")WebElement save_date;
	@FindBy(xpath= "//input[@id='saveReportDlg_reportNameField']")WebElement report_name;
	@FindBy(xpath="//table[@id='dlgSaveAndRun']")WebElement save_all;
	@FindBy(xpath= "//input[@id='saveReportDlg_DeveloperName']")WebElement unique_report;
	
	public void clickCreateDate() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		create_date.click();
		
	}
	public void clickDateField() {
		date_field.click();
		
	}
	public void clickDateImage() {
		image.click();
		
	}
	public void clickTodayDate() {
		today.click();
		
	}
	public void clickSaveDate() {
		save_date.click();
		
	}
	public void clickSaveAll() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		save_all.click();
		
	}
	public void enterIntoReportnameFeild(String userName) {
		enterText(unique_report, userName);

	}
	public void enterIntoReportUnameFeild(String userName) {
		enterText(report_name, userName);

	}
	
	
	

}
