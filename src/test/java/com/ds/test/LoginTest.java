package com.ds.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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
	@Description("login page started")
	@Epic("EP001")
	@Feature("featrure1:logo")
	@Story("story:login page")
	@Step("verify login page")
	@Severity(SeverityLevel.NORMAL)
	
	//@Test
	public static void LoginTest1() {

		loginPage.clickgetStarted();
		driver.navigate().back();
		report.logTestInfo("page navigate back");

		driver.navigate().forward();
		report.logTestInfo("page navigate forward");

	}
	
	

	@Description("sign in into the page")
	@Epic("EP001")
	@Feature("featrure1:signin")
	@Story("story:login page signin")
	@Step("verify login page signed in")
	@Severity(SeverityLevel.BLOCKER)

	@Test(dataProviderClass = ReadingDataFromXl.class, dataProvider = "logindata")
	public void validLoginTest2(String username, String password) throws InterruptedException {
		loginPage.clickgetStarted();
		signPage.clickSignin();
		report.logTestInfo("signin button clicked");


		signPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		report.logTestInfo("username entered");

		signPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		signPage.clickLogin();
		report.logTestInfo("login button clicked");

	}
	
	public void validLoginTest3(String username, String password) throws InterruptedException {
		loginPage.clickgetStarted();
		signPage.clickSignin();
		report.logTestInfo("signin button clicked");
		

	
}}
