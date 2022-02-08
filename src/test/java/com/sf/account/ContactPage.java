package com.sf.account;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.firebase.base.ReusableAllMethod;
import com.sf.leadsPage.LeadPage;

public class ContactPage extends ReusableAllMethod{

	public ContactPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//div[@class='requiredInput']//div[@class='errorMsg']")WebElement contact_msg;
	@FindBy(xpath = "//h2[@class='topName']")WebElement contact_checking;
	@FindBy(id= "con4")WebElement contact_company;
	@FindBy(xpath= "//td[@id='topButtonRow']//input[@title='Save']")WebElement contact_save;
	@FindBy(id = "name_lastcon2")WebElement contact_lname;
	@FindBy(id = "hotlist_mode")WebElement recently_created;
	@FindBys({
		@FindBy(id="hotlist_mode")
	})
	public List<WebElement>create;
	
	@FindBys({
		@FindBy(id="fcf")
	})
	
	
	public WebElement dropdown;
	
	@FindBy(xpath="//input[@title='New']")WebElement contact_new;
	@FindBy(xpath = "//h2[normalize-space()='Home']")WebElement contact_home;
	@FindBy(xpath = "//tr[contains(@class,'dataRow even first')]//th[1]//a[1]")WebElement contact_table;
	
	
	@FindBy(id = "con4")WebElement contact_lastname;


	public void enterInteContactLnameFeild(String userName) {
		enterText(contact_lname, userName);

	}
	public void enterIntoContactCompanyNameFeild(String userName) {
		enterText(contact_company, userName);

	}
	public void enterInteContactAccountnameFeild(String userName) {
		enterText(contact_lastname, userName);

	}
	
	public void clickContactNewButton() {
		contact_new.click();
		
	}
	public void clickContactHomeButton() {
		contact_home.click();
		
	}
	public void clickContactSaveButton() {
		contact_save.click();
		
	}
	public String clickContactCheckingButton() {
		return contact_checking.getText();
		
		
	}
	public void clickRecentlyCreatedButton() {
		recently_created.click();
		Select select = new Select(recently_created);
		select.selectByVisibleText("Recently Created");
		
		
	}
	public void CheckRecentContact() {
		for (WebElement linkall : create) {
			
						String[] str = linkall.getText().split("\\n");
						List<String> linkopt = Arrays.asList(str);

						if (linkopt.contains("Recently Created")) {
							System.out.println(" Test case pass");
						} else {
							System.out.println("fail");
						}
					}
	}
	public void Checkveiw() {
		LeadPage l =new LeadPage(driver);
		Select select = new Select( dropdown);
		select.selectByIndex(3);// veiw
		
	}

	public void clickContactTableButton() throws InterruptedException {
		Thread.sleep(3000);
		contact_table.click();
		
	}
	public String clickContactMesgutton() throws InterruptedException {
		Thread.sleep(3000);
		 return contact_msg.getText();
		
		
	}
}

