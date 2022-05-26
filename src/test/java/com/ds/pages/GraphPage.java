package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ds.reusable.ReusableAllMethod;

public class GraphPage extends ReusableAllMethod{

	public GraphPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//body//ul//a[text()='Graph']")
	WebElement Graph;
	
	@FindBy(xpath = "//body//a[text()='Graph Representations']]")
	WebElement graphRepresentation;
	

	public void clickGraphRepresentation() {
		graphRepresentation.click();
	}
	public void clickGraph() {
		Graph.click();
	}
}
