package com.firebase.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.firebase.base.ReusableAllMethod;

public class LoginPage extends ReusableAllMethod {
	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "password")
	WebElement passWord;
	@FindBy(id = "Login")
	WebElement btnLogin;
	@FindBy(id = "rememberUn")
	WebElement remember_me;
	@FindBy(xpath = "//span[@id='idcard-identity']")
	WebElement email_check;
	@FindBy(id = "forgot_password_link")
	WebElement f_password;
	@FindBy(id = "un")
	WebElement f_username;
	@FindBy(id = "continue")
	WebElement f_contineu;
	@FindBy(id = "header")
	WebElement f_expresul;
	@FindBy(id = "error")
	WebElement user_password_text;
	@FindBy(xpath = "//span[@id='idcard-identity']")
	WebElement user_Text;

	public void enterInteUsernameFeild(String userName) {
		enterText(username, userName);

	}

	public void enterIntePasswordFeild(String password) {

		enterText(passWord, password);

	}

	public void clickLoginButton() {
		btnLogin.click();

	}
//	public void  checkText() {
//		Asserting(user_Text);
//		System.out.println(user_Text);
//		
//		
//	}

	public String checkEmailCheck() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return email_check.getText();

	}

	public String checkForgotTextCheck() {
		return f_expresul.getText();

	}

	public String checkuserPasswordWrong() {
		return user_password_text.getText();

	}

	public void checkForgotPassword() {
		f_password.click();
		;

	}

	public void checkForgotContinue() {
		f_contineu.click();

	}

	public void checkrRememberFeild() {
		if (!remember_me.isSelected()) {
			remember_me.click();

		} else {
			System.out.println("check box selected");
		}

	}

	public void enterForgotPassword(String userName) {
		enterText(f_username, userName);

	}

	public void handleAlert() {
		AcceptAlert();
	}

}
