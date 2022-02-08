package com.sf.test.home;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.sf.base.BaseTest;

public class AcoountTest extends BaseTest {
	@Test
	public void handleLogout10() throws InterruptedException {
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
		
		homePage.clickAccountButton();
		homePage.PopUpLight();
		accountPage.clickCreateNewAccButton();
		accountPage.clickMenuAccButton();
		accountPage.enterIntoAccountrnameFeild("saving");
		accountPage.clickAccPagSaveButton();
		//Assert.assertEquals(accountPage.checkText(), "saving [View Hierarchy]");
}
@Test		
public void handleLogout11() throws InterruptedException {
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
	
	homePage.clickAccountButton();
	homePage.PopUpLight();	
	accountPage.clickcreateViewButton();
	veiw.enternameFeild("aa");
	veiw.enterIntouUnameFeild("123");
	veiw.clickSaveButton();

}
@Test
public void handleLogout12() throws InterruptedException {
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
	homePage.clickAccountButton();
	report.logTestInfo("account clicked");
	homePage.PopUpLight();
	veiw.clickEditButton();
	veiw.enternameFeild("natur123");
	report.logTestInfo("name field entered");
	
	veiw.clickAccountName();
	report.logTestInfo("button clicked");
	veiw.clickContain();
	veiw.enterFilterValue("a");
	veiw.lastActivityButtonRemove();
	report.logTestInfo("Last activity removed");
	veiw.clickLastActivityAddButton();
	report.logTestInfo("last activity added");
	veiw.clickSaveLastActivityButton();
	
}
@Test
public void  handleMergeAccount13() throws InterruptedException {
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
	report.logTestInfo("login sucessfully");
	homePage.clickAccountButton();
	homePage.PopUpLight();
	mergeAccount.clickMergeAccountButton();
	mergeAccount.enterIntoSearchField("saving");
	mergeAccount.clickFindaccountButton();
	mergeAccount.clickRow1Button();
	mergeAccount.clickRow2Button();
	mergeAccount.clickNextButton();
	mergeAccount.clickMergeButton();
	mergeAccount.AcceptAlert();
}
@Test
public void  handleCreateAccReport14() throws InterruptedException {
	String username = prop.getProperty("usernameSales");
	loginPage.enterInteUsernameFeild(username);
	report.logTestInfo("username entered");
	Thread.sleep(3000);
	String password = prop.getProperty("passwordSales");
	loginPage.enterIntePasswordFeild(password);
	report.logTestInfo("password entered");
	loginPage.checkrRememberFeild();
	report.logTestInfo("checkbox button checked");
	loginPage.clickLoginButton();
	report.logTestInfo("login sucessfully");
	homePage.clickAccountButton();
	report.logTestInfo("account clicked");
	homePage.PopUpLight();
	accountPage.clickLast30Button();
	report.logTestInfo("last 30 min clicked");
	datePage.clickDateField();
	report.logTestInfo("date successfully clicked");
	datePage.clickCreateDate();
	datePage.clickDateImage();
	datePage.clickTodayDate();
	datePage.clickSaveDate();
	datePage.enterIntoReportnameFeild("happ");
	report.logTestInfo("enetred name");
	datePage.enterIntoReportUnameFeild("hapy1234");
	report.logTestInfo("entered unique name");
	datePage.clickSaveAll();
}
}
