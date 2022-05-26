package com.ds.test;

import org.testng.annotations.Test;

import com.ds.base.BaseTest;
import com.ds.utlity.ReadingDataFromXl;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class GraphTest extends BaseTest{
	@Description("login page started")
	@Epic("EP001")
	@Feature("featrure1:logo")
	@Story("story:login page")
	@Step("verify login page")
	@Severity(SeverityLevel.NORMAL)

	@Test(dataProviderClass = ReadingDataFromXl.class, dataProvider = "code")

	public static void Test1(String text) throws InterruptedException {
		loginPage.clickgetStarted();
		report.logTestInfo("clicked get started");
		signPage.clickSignin();
		String username=prop.getProperty("username");
	
		signPage.enterInteUsernameFeild(username);
		String password=prop.getProperty("password");
		signPage.enterIntePasswordFeild(password);
		signPage.clickLogin();
		homePage.clickGraphgetStarted();
		report.logTestInfo("clicked linked list get started");
		graphPage.clickGraph();
		treePage.clickTreeTryHere();
	    treePage.enterIntoCodeTreeFeild(text);
	    treePage.clickTreeRunIntro();
	    treePage.navigate();
	    
	    graphPage.clickGraphRepresentation();
	    treePage.clickTreeTryHere();
	    treePage.enterIntoCodeTreeFeild(text);
	    treePage.clickTreeRunIntro();
	    treePage.navigate();
	}
		
	

}
