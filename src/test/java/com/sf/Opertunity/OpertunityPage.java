package com.sf.Opertunity;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.firebase.base.ReusableAllMethod;

public class OpertunityPage extends ReusableAllMethod{
	public OpertunityPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "opp3")WebElement oper_name;
	@FindBy(id="opp4")WebElement oper_acc;
	@FindBy(id= "opp9")WebElement oper_save;
	@FindBy(linkText  = "Today")WebElement time;
	@FindBy(id = "opp11")WebElement dropdown;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")WebElement save_all;
	
	@FindBys({
		@FindBy(id="open")
	})
	public List<WebElement>Quarterly_summary;
@FindBy(linkText  = "Opportunity Pipeline")WebElement oper_pipeline;
@FindBy(linkText  = "Stuck Opportunities")WebElement oper_stuck;
@FindBy(xpath  = "//select[@id='quarter_q']")WebElement oper_interval;
@FindBy(xpath  = "//select[@id='open']")WebElement oper_include;
	
	public void clickOperPipelineButton() {
		oper_pipeline.click();
		
	}
	public void clickOperIntervalButton() {
		oper_interval.click();
		
	}
	public void clickOperIncludeButton() {
		oper_include.click();
		
	}
	public void clickOperStuckButton() {
		oper_stuck.click();
		
	}
	
	public void checkQuarterlySumary() {
	for (WebElement operator : Quarterly_summary) {
		// System.out.println(oper.get(0).getText());
		String[] str = operator.getText().split("\\n");
		List oper_one = Arrays.asList(str);

		if (oper_one.contains("All Opportunities") || oper_one.contains("Open Opportunities")
				|| oper_one.contains("Closed Opportunities") || oper_one.contains("Closed/Won Opportunities")) {
			System.out.println(" Test case pass");
		} else {
			System.out.println("fail");
		}
	}
}
	
	public void enterInteOperName(String userName) {
		enterText(oper_name, userName);

	}
	public void enterInteOperacc(String userName) {
		enterText(oper_acc, userName);

	}
	public void clickOperSaveButton() {
		oper_save.click();
		
	}
	public void clickTimeButton() {
		time.click();
		
	}
	public void clickDropdownButton() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Qualification");
		
	}
	public void clickSaveAllButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		save_all.click();
		//waitUntilVisible(save_all);
		
	}
	
}
