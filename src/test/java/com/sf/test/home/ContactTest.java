package com.sf.test.home;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sf.base.BaseTest;

public class ContactTest extends BaseTest{
	
	@Test
	public void handleContact25() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		homePage.clickCreateNewButton();
		homePage.clickCreateNewContactButton();
		contactPage.enterInteContactLnameFeild("shivani");
		contactPage.enterIntoContactCompanyNameFeild("saving23");
		contactPage.clickContactSaveButton();
		Assert.assertEquals(contactPage.clickContactCheckingButton(), "shivani");
		
	
}
	@Test(priority=1)
	public void handleContact26() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		homePage.clickCreateNewVeiwButton();
		veiw.enternameFeild("tech1");
		veiw.enterIntouUnameFeild("tech1");
		veiw.clickSaveButton();

}
	@Test
	public void handleContact27() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		contactPage.clickRecentlyCreatedButton();
		contactPage.CheckRecentContact();
}
	@Test
	public void handleContact28() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		contactPage.Checkveiw();
}
	@Test
	public void handleContact29() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		contactPage.clickContactTableButton();
	
}
	@Test
	public void handleContact30() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		accountPage.clickcreateViewButton();
		veiw.enterIntouUnameFeild("EFGH");
		veiw.clickSaveButton();
		Assert.assertEquals(contactPage.clickContactMesgutton(), "Error: You must enter a value");
	
}
	@Test
	public void handleContact31() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		accountPage.clickcreateViewButton();
		veiw.enterIntouUnameFeild("ABCD");
		veiw.enterIntouUnameFeild("EFGH");
		veiw.clickVeiwCancel();
		contactPage.clickContactHomeButton();
		
	
}
	
	@Test
	public void handleContact32() throws InterruptedException {
		String username = prop.getProperty("usernameSales");
		loginPage.enterInteUsernameFeild(username);
		Thread.sleep(2000);
		String password = prop.getProperty("passwordSales");
		loginPage.enterIntePasswordFeild(password);
		loginPage.checkrRememberFeild();
		loginPage.clickLoginButton();
		
		homePage.clickContactButton();
		homePage.PopUpLight();
		contactPage.clickContactNewButton();
		contactPage.enterInteContactLnameFeild("indian");
		contactPage.enterInteContactAccountnameFeild("global media");
		contactPage.clickContactSaveButton();
	}
	
	
}
