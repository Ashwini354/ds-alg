package com.sf.leadsPage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.firebase.base.ReusableAllMethod;

public class LeadPage  extends ReusableAllMethod{

	public LeadPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@title='New']")WebElement new_leads;
	@FindBy(xpath="//input[@title='Go!']")WebElement go;
	@FindBy(id = "fcf")WebElement leads_veiw;
	@FindBy(xpath = "//input[@id='name_lastlea2']")WebElement leads_lname;
	@FindBy(xpath="//input[@id='lea3']")WebElement leads_company;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")WebElement leads_save;
	
	@FindBys({
		@FindBy(id="fcf")
	})
	public List<WebElement>link;
	
	public void clickLeadsNewButton() {
		new_leads.click();
		
	}
	public void clickNewLeadswButton() {
		leads_veiw.click();
		
	}
	public void clickLeadGoButton() {
		go.click();
		
	}
	public void enterInteLeadsLnameFeild(String userName) {
		enterText(leads_lname, userName);

	}

	public void enterInteLeadsCompanyFeild(String password) {

		enterText(leads_company, password);

	}
	public void clickLeadSaveButton() {
		leads_save.click();
		
	}
	public void clickTodayLeadwButton() {
		Select select = new Select(leads_veiw);
		select.selectByVisibleText("Today's Leads");
		
	}
	
	public void selectLeadsVeiwButton() {
		for (WebElement linkall : link) {
		
			String[] str = linkall.getText().split("\\n");
			List<String> linkopt = Arrays.asList(str);

			if (linkopt.contains("All Open Leads") || linkopt.contains("Lost Leads")
					|| linkopt.contains("My Unread Leads") || linkopt.contains("Recently Viewed Leads")) {
				System.out.println(" Test case pass");
			} else {
				System.out.println("fail");
			}
		}
	}
}

