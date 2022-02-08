package com.firebase.pages.profilePage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.firebase.base.ReusableAllMethod;

public class CalenderPage  extends ReusableAllMethod{

	public CalenderPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@id='IsRecurrence']")WebElement checkbox;
	@FindBy(xpath = "//input[@id='IsRecurrence']")WebElement weekly_radio;
	
	@FindBy(id = "RecurrenceEndDateOnly")WebElement two_weks;
	@FindBy(xpath = "//img[@title='Next Month']")WebElement arrow;
	
	
	@FindBy(xpath = "//div[@id='timePickerItem_34']")WebElement seven;
	@FindBy(xpath = "//a[normalize-space()='4:00 PM']")WebElement four;
	@FindBy(xpath = "//a[normalize-space()='8:00 PM']")WebElement eight;
	@FindBy(xpath = "//a[@title='Combo (New Window)']")WebElement combo;
	@FindBy(xpath  = "//li[@class='listItem4']//a[1]")WebElement button;
	@FindBy(id = "EndDateTime_time")WebElement end_time;
	@FindBy(xpath="//div[@id='timePickerItem_42']")WebElement nine;
	
	@FindBy(xpath = "//div[@id='p:f:j_id25:j_id69:28:j_id71:0:j_id72:calendarEvent:i']//div[@class='multiLineEventBlock dragContentPointer']")WebElement mouseover;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[6]")WebElement select_date;
	@FindBy(linkText = "Logout")WebElement logout;
	@FindBy(linkText = "Leads")WebElement leads;
	
	
	public void clickEightButton() {
		eight.click();
		
	}
	public void clickEndTime() {
		end_time.click();
		
	}
	public void clickNine() {
		nine.click();
		
	}
	public void clickFour() {
		four.click();
		
	}
	public void clickSeven() {
		seven.click();
		
	}
	public void clickArrow() {
		arrow.click();
		
	}
	public void clickSelectDate() {
		select_date.click();
		
	}
	
	public void clickTwoWeek() {
		two_weks.click();
		
	}
	public void clickCheckbox() {
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		else {
			System.out.println("ALREADY SELECTED");
		}
		
	}
	
	public void clickWeeklyRadio() {
		if(!weekly_radio.isSelected()) {
			weekly_radio.click();
		}
		else {
			System.out.println("ALREADY SELECTED");
		}
	}
	public void clickMouseOver() {
		Actions action=new Actions(driver);
	    action.moveToElement(mouseover).build().perform();
		
	}
	
//	public void clickButton() {
//		button.click();
//		driver.switchTo().window(oldwindow);
//		
//	}
	public void clickWindoeButton() throws InterruptedException {
		String oldwindow = driver.getWindowHandle();
		combo.click();
		Thread.sleep(5000);
		Set<String> window2 = driver.getWindowHandles();
		System.out.println(window2.size());
		for (String Windows : window2) {
			if (!Windows.equals(oldwindow)) {
				driver.switchTo().window(Windows);
				break;
				// System.out.println();
			}
		}
		Thread.sleep(3000);
		button.click();
		driver.switchTo().window(oldwindow);
		
	}
	
	
}
