package com.firebase.pages.profilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.firebase.base.ReusableAllMethod;

public class EmailPage extends ReusableAllMethod {
	
	public EmailPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="auto_bcc1")
	WebElement radio;
	@FindBy(xpath = "//input[@title='Save']")
	WebElement save;
	
	@FindBy(xpath = "//div[@class='messageText']")
	WebElement textcheck;
	@FindBy(xpath = "//span[@id='CalendarAndReminders_font']")
	WebElement calenderRemaider;
	@FindBy(xpath = "//span[@id='Reminders_font']")
	WebElement remainder;
	@FindBy(xpath = "//input[@id='testbtn']")
	WebElement button;
	@FindBy(id = "sender_name")
	WebElement email_name;
	@FindBy(id = "sender_email")
	WebElement my_email;
	public void enternameFeild(String text) {
		enterText(email_name, text);

	}

	public void enterEmailFeild(String text) {

		enterText(my_email, text);

	}
	public void clickRadioButton() {
	
	System.out.println("Radio " + radio.isSelected());
	if (!radio.isSelected()) {
		radio.click();
	} else {
		System.out.println("not");
	}

	}

	public void checkCalenderRemainder() {
		calenderRemaider.click();

	}
	public void checkzrenainder() {
		remainder.click();

	}
	public void checkButton() {
		button.click();

	}
	public String checkTextCheck() {
		return textcheck.getText();

	}
}
