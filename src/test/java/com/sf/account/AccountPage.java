package com.sf.account;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.firebase.base.ReusableAllMethod;

public class AccountPage  extends ReusableAllMethod{
	public AccountPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "acc2")WebElement acc_name;
	@FindBy(id="createNewLabel")WebElement create_new_acc;
	@FindBy(xpath= "//td[@id='topButtonRow']//input[@title='Save']")WebElement save;
	@FindBy(xpath = "//a[@class='accountMru menuButtonMenuLink']")WebElement menu_acc;
	@FindBy(xpath  = "//div[@id='acc2_ileinner']")WebElement a_text;
	@FindBy(linkText  = "Create New View")WebElement create_view;
	@FindBy(linkText  = "Accounts with last activity > 30 days")WebElement last_30;
	
	@FindBys({
		@FindBy(id="createNewMenu")
	})
	public List<WebElement>menu;

	public void clickCreateNewAccButton() {
		create_new_acc.click();
		
	}
	public void clickMenuAccButton() {
		menu_acc.click();
		
	}
	
	public void enterIntoAccountrnameFeild(String userName) {
		enterText(acc_name, userName);

	}
	public void clickAccPagSaveButton() {
		save.click();
		
	}
	public WebElement checkText() {
		Asserting(a_text.getText());
		return a_text;
	}
	public void clickcreateViewButton() {
		create_view.click();
		
	}
	public void clickLast30Button() {
		last_30.click();
		
	}
	

}
