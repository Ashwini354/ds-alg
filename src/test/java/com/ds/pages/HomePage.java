package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ds.reusable.ReusableAllMethod;

public class HomePage extends ReusableAllMethod{

	public HomePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//div[@class='card h-100']//a[@href='linked-list']")
	WebElement Linkes_get_started;
	
	@FindBy(xpath = "//div[@class='card h-100']//a[@href='tree']")
	WebElement tree_get_started;
	
	@FindBy(xpath = "//div[@class='card h-100']//a[@href='graph']")
	WebElement graph_get_started;
	
	
	public void clickLinkedgetStarted() {
		Linkes_get_started.click();
		}
	public void clickTreegetStarted() {
	tree_get_started.click();
		}
	
	public void clickGraphgetStarted() {
		graph_get_started.click();
			}

}
