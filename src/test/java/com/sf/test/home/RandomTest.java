package com.sf.test.home;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.firebase.pages.LoginPage.LoginPage;
import com.sf.base.BaseTest;
import com.sf.pages.HomePage.ProfilePage;

public class RandomTest extends BaseTest{
	@Test
	public  void handleRandomScenario33() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		homePage.clickHomeButton();
		homePage.PopUpLight();
		profilePage.clickProfileNameAbout();
		Assert.assertEquals(profilePage.CheckProfileName(), "ashwini ashwini");
		

}
	@Test
	public  void handleRandomScenario34() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		homePage.clickHomeButton();
		homePage.PopUpLight();
		profilePage.clickProfileNameAbout();
		profilePage.clickContactEditButton();
		profilePage.clickAbout();
		profilePage.enterLastName("pandiyan");
		profilePage.clickSaveAbout();
		Assert.assertEquals(profilePage.CheckNEWProfileName(), "ashwini pandiyan ");
		
		
	
}
	@Test
	public  void handleRandomScenario35() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		homePage.clickPlusButton();
		homePage.clickCustomizeMyTabButton();
		settingPage.clickReportsButton();;
		settingPage.clickReport0Button();
		settingPage.clickReportSaveButton();
		homePage.clickUserMenuButton();
		homePage.clickLogoutButton();
		Launch(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		String username1 = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username1);
		Thread.sleep(2000);
		String password1 = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password1);
}
	@Test
	public  void handleRandomScenario36() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		homePage.clickHomeButton();
		homePage.PopUpLight();
		homePage.clickDateCheckButton();
		Assert.assertEquals(homePage.checkCalenderNamekButton(),"Calendar for ashwini pandiyan - Day View");
		calenderPage.clickEightButton();
		calenderPage.clickWindoeButton();
		calenderPage.clickEndTime();
		calenderPage.clickNine();
		accountPage.clickAccPagSaveButton();
		calenderPage.clickMouseOver();
		
	}
	@Test
	public  void handleRandomScenario37() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		homePage.clickHomeButton();
		homePage.PopUpLight();
		homePage.clickDateCheckButton();
		
		calenderPage.clickFour();
		calenderPage.clickWindoeButton();
		calenderPage.clickEndTime();
		calenderPage.clickSeven();
		calenderPage.clickCheckbox();
		calenderPage.clickWeeklyRadio();
		calenderPage.clickTwoWeek();
		calenderPage.clickArrow();
		calenderPage.clickSelectDate();
		accountPage.clickAccPagSaveButton();
		
}
}
