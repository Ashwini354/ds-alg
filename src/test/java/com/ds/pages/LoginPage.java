package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ds.reusable.ReusableAllMethod;

public class LoginPage extends ReusableAllMethod {
	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//button[@class='btn']")
	WebElement get_started;

	public void clickgetStarted() {
		if (get_started!=null && get_started.isDisplayed()) {
			System.out.println(" clickgetStarted "+ get_started.isDisplayed()+" "+get_started.isEnabled());
			get_started.click();
		}
	}

}
