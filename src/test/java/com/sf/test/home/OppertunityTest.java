package com.sf.test.home;

import org.testng.annotations.Test;

import com.sf.base.BaseTest;

public class OppertunityTest extends BaseTest {
	@Test
	public void handleOpertunity15() throws InterruptedException {
	String username = prop.getProperty("usernameSales");
	loginPage.enterInteUsernameFeild(username);
	Thread.sleep(2000);
	String password = prop.getProperty("passwordSales");
	loginPage.enterIntePasswordFeild(password);
	loginPage.checkrRememberFeild();
	report.logTestInfo("check box clicked");
	loginPage.clickLoginButton();
	report.logTestInfo("login button clicked");
	homePage.clickOpertunityButton();
	report.logTestInfo("oppertunity clicked");
	homePage.PopUpLight();
	oper.checkQuarterlySumary();

}
	@Test
	public void handleOpertunity16() throws InterruptedException {
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
		report.logTestInfo("login button clicked");
		homePage.clickOpertunityButton();
		report.logTestInfo("oppertunity clicked");
		homePage.PopUpLight();
		homePage.clickCreateNewButton();
		homePage.clickOpertunitySelectButton();
		oper.enterInteOperName("manager");
		oper.enterInteOperacc("saving23");
		oper.clickOperSaveButton();
		oper.clickTimeButton();
		oper.clickDropdownButton();
		oper.clickSaveAllButton();
}
@Test
public void handleOpertunity17() throws InterruptedException {
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
	report.logTestInfo("login button clicked");
	homePage.clickOpertunityButton();
	report.logTestInfo("oppertunity clicked");
	homePage.PopUpLight();
	oper.clickOperPipelineButton();
	
}
@Test
public void handleOpertunity18() throws InterruptedException {
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
	report.logTestInfo("login button clicked");
	homePage.clickOpertunityButton();
	report.logTestInfo("oppertunity clicked");
	homePage.PopUpLight();
	oper.clickOperStuckButton();
}
@Test
public void handleOpertunity19() throws InterruptedException {
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
	report.logTestInfo("login button clicked");
	homePage.clickOpertunityButton();
	report.logTestInfo("oppertunity clicked");
	homePage.PopUpLight();
	oper.clickOperIntervalButton();
	oper.clickOperIncludeButton();
}
//@Test

}
