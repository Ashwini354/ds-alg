package com.sf.test.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.utility.Constant;
import com.sf.base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public static void invalidLoginTest() {

		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		loginPage.enterIntePasswordFeild("123");
		report.logTestInfo("password enetrd");
		loginPage.clickLoginButton();
		report.logTestInfo("login button clicked");

		WebElement exp_text = driver.findElement(By.id("error"));
		Assert.assertEquals(exp_text.getText(),Constant.PASSWORD_WRONG);
				
				
				

	}

	@Test
	public void validLoginTest2() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password enetrd");
		loginPage.clickLoginButton();
		report.logTestInfo("password enetrd");

	}

	@Test
	public void validLoginTest3() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password enetrd");
		loginPage.checkrRememberFeild();
		report.logTestInfo("checkbox button checked");
		loginPage.clickLoginButton();
		report.logTestInfo("password enetrd");
		homePage.clickUserMenuButton();
		report.logTestInfo("usermenu clicked");
		homePage.clickLogoutButton();
		report.logTestInfo("logout sucesfully");
		Thread.sleep(2000);

		Assert.assertEquals(loginPage.checkEmailCheck(), Constant.EMAIL);

	}
	@Test
	public void validLoginTest4a() throws InterruptedException {
		loginPage.checkForgotPassword();
		String username = prop.getProperty("usernameSales");
		loginPage.enterForgotPassword(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		loginPage.checkForgotContinue();
		report.logTestInfo("forgot checkbox continues");
		Thread.sleep(2000);
		Assert.assertEquals(loginPage.checkForgotTextCheck(), Constant.TEXT);
	}
	@Test
	public void validLoginTest4b() throws InterruptedException {
		String username = prop.getProperty("username_invalid");
		loginPage.enterInteUsernameFeild(username);
		loginPage.enterForgotPassword("username enterd");
		Thread.sleep(2000);
		String password = prop.getProperty("password_invalid");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password enetrd");
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.checkuserPasswordWrong(), Constant.PASSWORD_WRONG);
	

}
}
