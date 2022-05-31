package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.ds.reusable.ReusableAllMethod;
import com.ds.utlity.ReadingDataFromXl;

public class SignIn extends ReusableAllMethod{

	public SignIn(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//a[@href='/login']")
	WebElement signin;
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passWord;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement invalidmsg;
	@FindBy(xpath="//ul/a[3]")
	WebElement signout;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement text;
	
	public void enterInteUsernameFeild(String userName) {
		enterText(username, userName);

	}

	public void enterIntePasswordFeild(String password) {

		enterText(passWord, password);

	}
	public void clickSignin() {
		signin.click();
	

	}
	public void clickLogin() {
		login.click();
	

	}
	public void clickSignout() {
		signout.click();
	

	}
	public String checkuserPasswordWrong() {
		return invalidmsg.getText();

	}
	//@Test(dataProviderClass = ReadingDataFromXl.class, dataProvider = "logindata",priority = 2)
	public String assertMsg(String username, String password) throws InterruptedException {
		if (username == "ashu" && password == "123") {

			System.out.println(text.getText());
		}

		else {
			System.out.println(text.getText());
		}
		return text.getText();

	}


}
