package com.sf.pages.HomePage;

import java.util.Arrays;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.firebase.base.ReusableAllMethod;


public class ProfilePage extends ReusableAllMethod{
	
	public ProfilePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath =   "//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")WebElement contact_edit;
	@FindBy(xpath =   "//a[normalize-space()='About']")WebElement about;
	@FindBy(id="lastName")WebElement lname;
	@FindBy(xpath = "//input[@value='Save All']")WebElement save_about;
	@FindBy(xpath = "//span[normalize-space()='Post']")WebElement post;
	@FindBy(xpath = "//body")WebElement post_enter;
	@FindBy(xpath = "//input[@id='publishersharebutton']")WebElement post_btn_click;
	@FindBy(id = "displayBadge")WebElement moderator;
	@FindBy(id =  "uploadLink")WebElement add_photo;
	@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadInputFile']")WebElement image;
	@FindBy(id = "j_id0:uploadFileForm:uploadBtn")WebElement image_add;
	@FindBy(id = "j_id0:j_id7:save")WebElement save;
	@FindBy(xpath = "//div[@class='greeting']//a[@href='/_ui/core/userprofile/UserProfilePage']")WebElement profile_name;
	
	@FindBy(linkText ="ashwini ashwini")WebElement check_profile_name;
	@FindBy(id ="tailBreadcrumbNode")WebElement check_new_profile_name;
	
	
	
	
	
	public void clickContactEditButton() {
		contact_edit.click();
		waitUntilVisible(contact_edit);
		
		
		
	}
	
	public void clickAddPhotoButton() throws InterruptedException {
		add_photo.click();
		Thread.sleep(3000);
		 driver.switchTo().frame("uploadPhotoContentId");
		
		
	}
	public void clickModeratorButton() {
		Actions a = new Actions(driver);
		a.moveToElement(moderator).build().perform();
		
		
		
	}
	public void clickAbout() {
		driver.switchTo().frame("contactInfoContentId");
		about.click();
		//waitUntilVisible(about);
	}
	public void clickPost() {
		
		post.click();
waitUntilVisible(post);
driver.switchTo().frame(0);
	}
	public void enterPostField(String text) {
		enterText(post_enter, text);
		driver.switchTo().defaultContent();

	}
	public void enterLastName(String lastName) {
		enterText(lname, lastName);
		

	}
	public String CheckProfileName() {
		return check_profile_name.getText();
		
	}
	
	public String CheckNEWProfileName() {
		return check_new_profile_name.getText();
		
	}
	public void enterImagePath() {
		
		image.sendKeys("/Users/ashwiniramamurthy/Downloads/ashu.jpg");
		
		

	}
	public void clickSaveAbout() {
		save_about.click();
		
		
	}
	public void clickProfileNameAbout() {
		profile_name.click();
		
		
	}
	public void clickPostSave() {
		post_btn_click.click();
		waitUntilVisible(post_btn_click);
		
		
	}
	public void clickImageAdd() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("uploadPhotoContentId");
		image_add.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}	
public void savePic() {
	save.click();
}
}
