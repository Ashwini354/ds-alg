package com.sf.test.home;

import org.testng.annotations.Test;

import com.firebase.pages.LoginPage.LoginPage;
import com.sf.base.BaseTest;

public class LeadsTest extends BaseTest{
	//@Test
	public void handleOpertunity20() throws InterruptedException {
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
		report.logTestInfo("logout sucesfully");
		homePage.clickLeadsButton();
		report.logTestInfo("leads clicked");
		homePage.PopUpLight();
	}
	//@Test
	public void handleOpertunity21() throws InterruptedException {
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
		report.logTestInfo("logout sucesfully");
		homePage.clickLeadsButton();
		homePage.PopUpLight();
		leadPage.clickNewLeadswButton();
		report.logTestInfo("leads clicked");
		report.logTestInfo("new clicked");
		leadPage.selectLeadsVeiwButton();
	}
	@Test 
	public void handleOpertunity22() throws InterruptedException {
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
		report.logTestInfo("login sucesfully");
		homePage.clickLeadsButton();
		report.logTestInfo("leads clicked");
		homePage.PopUpLight();
		leadPage.clickTodayLeadwButton();
		leadPage.clickLeadGoButton();
		report.logTestInfo("go button clicked");
		Thread.sleep(2000);
		homePage.clickUserMenuButton();
		homePage.clickLogoutButton();
		
		report.logTestInfo("logout successfully");

		Launch(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		Thread.sleep(5000);
		String username1 = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username1);
		Thread.sleep(2000);
		String password1 = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password1);
		
		loginPage.clickLoginButton();
		
		
	
}
	//@Test
	public void handleOpertunity23() throws InterruptedException {
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
		report.logTestInfo("logout sucesfully");
		homePage.clickLeadsButton();
		report.logTestInfo("leads clicked");
		homePage.PopUpLight();
		leadPage.clickTodayLeadwButton();
		leadPage.clickLeadGoButton();
		report.logTestInfo("go button clicked");
	}
	
	//@Test
	public void handleOpertunity24() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		report.logTestInfo("password enetrd");
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		report.logTestInfo("logout sucesfully");
		homePage.clickLeadsButton();
		report.logTestInfo("leads clicked");
		homePage.PopUpLight();
		leadPage.clickLeadsNewButton();
		leadPage.enterInteLeadsLnameFeild("ABCD");
		report.logTestInfo(" lastname eneterd");
		leadPage.enterInteLeadsCompanyFeild("ABCD");
		report.logTestInfo("company name enterd");
		leadPage.clickLeadSaveButton();
	}
	
	
}
