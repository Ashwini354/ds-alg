package com.sf.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MergeAccount extends AccountPage {
	public MergeAccount(WebDriver driver) {
		super(driver);

	}

	@FindBy(linkText  = "Merge Accounts")
	WebElement merge_acc;
	@FindBy(id = "srch")
	WebElement search;
	@FindBy(xpath= "//div[@class='pbWizardBody']//input[2]")
	WebElement find_acc;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]")
	WebElement row1;
	@FindBy(xpath  = "//html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/th[1]")
	WebElement row2;
	
	@FindBy(xpath  = "//div[@class='pbBottomButtons']//input[@title='Merge']")
	WebElement merge;
	@FindBy(xpath = "//div[@class='pbBottomButtons']//input[@title='Next']")
	WebElement next;
public void clickNextButton() {
	next.click();

}
public void clickMergeButton() {
	merge.click();

}
public void clickMergeAccountButton() {
	merge_acc.click();

}
public void clickRow1Button() {
	if(!row1.isSelected()) {
		row1.click();
		System.out.println("selected");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
public void clickRow2Button() {
	if(!row2.isSelected()) {
		row2.click();
		System.out.println("selected");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public void enterIntoSearchField(String userName) {
	enterText(search, userName);

}
public void clickFindaccountButton() {
	find_acc.click();

}

}