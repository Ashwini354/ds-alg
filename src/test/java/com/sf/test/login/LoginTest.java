package com.sf.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sf.base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public static void invalidLoginTest() {

		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		loginPage.enterIntePasswordFeild("123");
		loginPage.clickLoginButton();

		WebElement exp_text = driver.findElement(By.id("error"));
		Assert.assertEquals(exp_text.getText(),
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");

	}

	@Test
	public void validLoginTest2() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);

		loginPage.clickLoginButton();

	}

	@Test
	public void validLoginTest3() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		homePage.clickUserMenuButton();
		homePage.clickLogoutButton();
		Thread.sleep(2000);

		Assert.assertEquals(loginPage.checkEmailCheck(), "ashu@techarc.com");

	}
	@Test
	public void validLoginTest4a() throws InterruptedException {
		loginPage.checkForgotPassword();
		String username = prop.getProperty("usernameSales");
		loginPage.enterForgotPassword(username);
		Thread.sleep(2000);
		loginPage.checkForgotContinue();
		Thread.sleep(2000);
		Assert.assertEquals(loginPage.checkForgotTextCheck(), "Check Your Email");
	}
	@Test
	public void validLoginTest4b() throws InterruptedException {
		String username = prop.getProperty("username_invalid");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("password_invalid");
		loginPage.enterIntePasswordFeild(password);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.checkuserPasswordWrong(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
	

}
}
