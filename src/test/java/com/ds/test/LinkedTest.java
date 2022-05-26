package com.ds.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
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
public class LinkedTest extends BaseTest {
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
		homePage.clickLinkedgetStarted();
		report.logTestInfo("clicked linked list get started");
		linkedList.clickLinkedIntro();
		report.logTestInfo("clicked linked list intro");
		linkedList.clickLinkedTryHere();
		report.logTestInfo("clicked on try here");

		linkedList.enterIntoCodeLinkedFeild(text);
		report.logTestInfo("user enetred the code");
		linkedList.clickLinkedRunIntro();
		report.logTestInfo("clicked run");
		linkedList.navigate();
		report.logTestInfo("navigate back");
		linkedList.clickCreatingLinkedList();
		report.logTestInfo("creating linked listed button clicked");
		
		linkedList.clickLinkedTryHere();
		report.logTestInfo("clicked try here button");
		linkedList.enterIntoCodeLinkedFeild(text);
		report.logTestInfo(prop.getProperty("phyon"));
		linkedList.clickLinkedRunIntro();
		report.logTestInfo(prop.getProperty("run"));
		linkedList.navigate();
		linkedList.clickLinkedListTypes();
		linkedList.clickLinkedTryHere();
		linkedList.enterIntoCodeLinkedFeild(text);
		linkedList.clickLinkedRunIntro();
		linkedList.navigate();
		linkedList.clickLinkedImplements();
		linkedList.clickLinkedTryHere();
		linkedList.enterIntoCodeLinkedFeild(text);
		linkedList.clickLinkedRunIntro();
		linkedList.navigate();
		linkedList.clickLinkedTraversal();
		linkedList.clickLinkedTryHere();
		linkedList.enterIntoCodeLinkedFeild(text);
		linkedList.clickLinkedRunIntro();
		linkedList.navigate();
		Thread.sleep(3000);
		linkedList.clickLinkedInsertions();
		linkedList.clickLinkedTryHere();
		linkedList.enterIntoCodeLinkedFeild(text);
		linkedList.clickLinkedRunIntro();
		linkedList.navigate();
		Thread.sleep(3000);
		linkedList.clickLinkedDeletion();
		
		linkedList.clickLinkedTryHere();
		linkedList.enterIntoCodeLinkedFeild(text);
		linkedList.clickLinkedRunIntro();
		linkedList.navigate();
		linkedList.clickLinkedPracise();
		linkedList.navigate();
		
		

	}
	
	
}
