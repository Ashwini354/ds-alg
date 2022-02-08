package com.firebase.pages.profilePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.firebase.base.ReusableAllMethod;

public class SettingPage extends ReusableAllMethod {
	

		public SettingPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
		
	@FindBy(xpath= "//div[@id='PersonalInfo']")WebElement personal;
	@FindBy(id = "LoginHistory_font")WebElement login_history;
	@FindBy(xpath="//a[contains(text(),'Download login history for last six months, includ')]")WebElement download;
	
	
	@FindBy(id = "DisplayAndLayout_font")WebElement display_layout;
	@FindBy(id = "CustomizeTabs_font")WebElement customize_tab;
	@FindBy(id = "p4")WebElement select_contact;
	@FindBys({
		@FindBy(id="duel_select_1")
	})
	public List<WebElement>check1;
	@FindBy(id = "duel_select_1")WebElement report_remove;
	@FindBy(xpath= "//a[@id='duel_select_0_left']")WebElement remove;
	@FindBy(id = "duel_select_0")WebElement dropdown1;
	@FindBys({
		@FindBy(id="duel_select_0")
	})
	public List<WebElement>dropdown;
	@FindBy(xpath= "//a[@id='duel_select_0_right']")WebElement reportsave;
	@FindBy(xpath= "//input[@value=' Save ']")WebElement save;
	@FindBy(id= "EmailSetup_font")WebElement email;
	@FindBy(id= "EmailSettings_font")WebElement my_email_setting;
	
	
	public void clickEmailButton() {
		email.click();
	}
	public void clickMyEmailSettingButton() {
	my_email_setting.click();
	}
	

public void clickPersonalButton() throws InterruptedException {
	Thread.sleep(3000);
	personal.click();
	//waitUntilVisible(personal);
}
public void clickLoginHistoryButton() {
	login_history.click();
}
public void clickReportSaveButton() {
	reportsave.click();
}

public void clickDownloadButton() {
	download.click();
}
public void clickDiaplayAndLayoutButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	display_layout.click();
}
public void clickcustomizeTabButton() {
	customize_tab.click();
}
public void clickRemoveButton() {
	remove.click();
	//waitUntilVisible(remove);
}
public void clickSaveButton() {
	save.click();
}
public void clickSelectcontactButton() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	select_contact.click();
	Select select_sales=new Select((WebElement) select_contact);
	select_sales.selectByVisibleText("Salesforce Chatter");
}
public void clickReportsButton() {
	
	for(WebElement c1:check1) {
		if(c1.getText().contains("Reports")) {
			if(c1.isDisplayed()) {
				///WebElement report_remove=driver.findElement(By.id("duel_select_1"));
				Select select4=new Select(report_remove);
				select4.selectByVisibleText("Reports");
				
				clickRemoveButton();
				
			System.out.println(" REPORTS REMOVED");
			
			
		}
		}
		else {
			System.out.println("REPORTS NOT REMOVED");
		}
	}
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
public void clickReport0Button() throws InterruptedException {
	
	
	for(WebElement drop:dropdown) {
		if(drop.getText().contains("Reports")) {
			if(drop.isSelected()) {
			System.out.println("ALREADY SELECTED");
		}
	
		else if(!drop.isSelected()) {
			//WebElement dropdown1=driver.findElement(By.id("duel_select_0"));
			
			Select select1=new Select( (WebElement) dropdown1);
			
			select1.selectByVisibleText("Reports");
			System.out.println("REPORTS  SELECTED");
			driver.findElement(By.xpath("//img[@title='Add']")).click();
			
		}
	}
	
	}
	Thread.sleep(5000);

}



}
	
	
