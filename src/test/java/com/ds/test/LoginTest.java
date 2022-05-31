package com.ds.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ds.base.AllureListeners;
import com.ds.base.BaseTest;
import com.ds.utlity.ReadingDataFromXl;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({ AllureListeners.class })
public class LoginTest extends BaseTest {
	


	@Description("sign in into the page")
	@Epic("EP001")
	@Feature("featrure1:signin")
	@Story("story:login page signin")
	@Step("verify login page signed in")
	@Severity(SeverityLevel.BLOCKER)

	@Test(dataProviderClass = ReadingDataFromXl.class, dataProvider = "logindata",priority = 2)
	public void validLoginTest2(String username, String password) throws InterruptedException {

		signPage.clickSignin();
		report.logTestInfo("signin button clicked");

		signPage.enterInteUsernameFeild(username);
		Thread.sleep(1000);
		report.logTestInfo("username entered");

		signPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		signPage.clickLogin();
		report.logTestInfo("login button clicked");
SoftAssert s=new SoftAssert();
		
		s.assertEquals(signPage.assertMsg(username, password), " Invalid Username and Password ");
		//s.assertAll();
		signPage.clickSignout();
		Thread.sleep(1000);

	}
	
	@Test(priority = 1)
	public void getStarted() throws InterruptedException {
		loginPage.clickgetStarted();
	}

	
}
