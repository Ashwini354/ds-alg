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
		report.logTestInfo("signin button clicked");
		String username=prop.getProperty("username");
	
		signPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		String password=prop.getProperty("password");
		signPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		signPage.clickLogin();
		report.logTestInfo("Login clicked");
		homePage.clickGraphgetStarted();
		report.logTestInfo("clicked linked list get started");
		graphPage.clickGraph();
		report.logTestInfo("Graph button clicked");
		treePage.clickTreeTryHere();
		report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    graphPage.clickGraphRepresentation();
	    report.logTestInfo("signin Representation button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	}
		
	

}
