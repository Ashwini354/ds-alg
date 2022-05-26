package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ds.reusable.ReusableAllMethod;

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
	public String checkuserPasswordWrong() {
		return invalidmsg.getText();

	}


}
