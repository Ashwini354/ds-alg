package com.sf.test.home;

import org.testng.annotations.Test;

import com.salesforce.utility.Constant;
import com.sf.base.BaseTest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
	@Test
	public void SelectUserMenu5() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		loginPage.clickLoginButton();
		report.logTestInfo("login successfull");
		homePage.clickUserMenuButton();
		report.logTestInfo("usermenu clicked");
		homePage.checkUserMenuText();
		 
	}
	@Test
	public void handleUploadImage6() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		loginPage.clickLoginButton();
		report.logTestInfo("login successfull");
		homePage.clickUserMenuButton();
		report.logTestInfo("usermenu clicked");
		homePage.clickMyProfile();
		Thread.sleep(3000);
		profilePage.clickContactEditButton();
		profilePage.clickAbout();
		profilePage.enterLastName("ashwini");
		report.logTestInfo("name entered");
		profilePage.clickSaveAbout();
		profilePage.clickPost();
		report.logTestInfo("post clicked");
		profilePage.enterPostField("hello");
		report.logTestInfo("post box entered");
		profilePage.clickPostSave();
		profilePage.clickModeratorButton();
		profilePage.clickAddPhotoButton();
		profilePage.enterImagePath();
		profilePage.clickImageAdd();
		profilePage.savePic();
	

}
	@Test
	public void handleMySetting7() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		loginPage.clickLoginButton();
		report.logTestInfo("login successfull");
		homePage.clickUserMenuButton();
		report.logTestInfo("usermenu clicked");
		homePage.clickMySettingButton();
		report.logTestInfo("my setingclicked");
		settingPage.clickPersonalButton();
		report.logTestInfo("personal clicked");
		settingPage.clickLoginHistoryButton();
		
		settingPage.clickDownloadButton();
		report.logTestInfo("download successfull");
		settingPage.clickDiaplayAndLayoutButton();
		report.logTestInfo("display and layout clicked");
		settingPage.clickcustomizeTabButton();
		report.logTestInfo("customize my tab clicked");
		settingPage.clickSelectcontactButton();
		settingPage.clickReportsButton();
		report.logTestInfo("reports removed");
		settingPage.clickReport0Button();
		report.logTestInfo("reports added");
		settingPage.clickReportSaveButton();
		settingPage.clickSaveButton();
		settingPage.clickEmailButton();
		settingPage.clickMyEmailSettingButton();
		emailPage.enternameFeild("234");
		report.logTestInfo("entered name");
		emailPage.enterEmailFeild("ashwinir.cse@gmail.com");
		report.logTestInfo("entered email");
		emailPage.clickRadioButton();
		//emailPage.checkTextCheck();
		emailPage.checkCalenderRemainder();
		emailPage.checkzrenainder();
		emailPage.checkButton();
		
	
}
	@Test
public void handleDeveloperConsole8() throws InterruptedException {
	String username = prop.getProperty("usernameSales");
	loginPage.enterInteUsernameFeild(username);
	report.logTestInfo("username entered");
	Thread.sleep(2000);
	String password = prop.getProperty("passwordSales");
	loginPage.enterIntePasswordFeild(password);
	report.logTestInfo("password entered");
	loginPage.clickLoginButton();
	report.logTestInfo("login successfull");
	homePage.clickUserMenuButton();
	report.logTestInfo("usermenu clicked");
	homePage.clickDeveloperConsoleButton();
	report.logTestInfo("developer console clicked");
	
}
@Test
	public void handleLogout9() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password entered");
		loginPage.checkrRememberFeild();
		report.logTestInfo("check box clicked");
		loginPage.clickLoginButton();
		report.logTestInfo("login successfull");
		homePage.clickUserMenuButton();
		report.logTestInfo("usermenu clicked");
		homePage.clickLogoutButton();
		report.logTestInfo("logout complete");
		AssertJUnit.assertEquals(loginPage.checkEmailCheck(),Constant.EMAIL);
}
	
	
}

