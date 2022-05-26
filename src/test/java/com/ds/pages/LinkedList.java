package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ds.reusable.ReusableAllMethod;

public class LinkedList extends ReusableAllMethod {

	public LinkedList(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(//body//ul)[2]")
	WebElement linked_intro;
	@FindBy(xpath = "//body//a[text()='Creating Linked LIst']")
	WebElement linked_creating;
	
	@FindBy(xpath = "//body//a[text()='Types of Linked List']")
	WebElement linked_types;
	
	@FindBy(xpath = "//div[@class='col-sm']/a")
	WebElement linked_tryhere;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement linked_introCode;
	@FindBy(xpath = "//button[@type='button']")
	WebElement linked_intorRun;
	@FindBy(xpath="//body//a[text()='Implement Linked List in Python']")
	WebElement implementlinked;
	
	@FindBy(xpath = "//body//a[text()='Traversal']")
	WebElement linked_traversal;
	
	@FindBy(xpath = "//body//a[text()='Insertion']")
	WebElement linked_insertion;
	
	@FindBy(xpath = "//body//a[text()='Deletion']")
	WebElement linked_deletion;
	
	@FindBy(xpath = "//body//a[text()='Practice Questions']")
	WebElement linked_practice;
	
	public void clickLinkedIntro() {
	linked_intro.click();
	}
	
	
	public void clickLinkedTryHere() {
		linked_tryhere.click();

}
	public void clickLinkedRunIntro() {
		linked_intorRun.click();

}
	public void enterIntoCodeLinkedFeild(String name){
		linked_introCode.sendKeys(name);
		

	}
	public void clickCreatingLinkedList() {
		linked_creating.click();
	}
	public void navigate() {
		driver.navigate().back();
	}
	
	public void clickLinkedListTypes() {
		linked_types.click();
	}
	public void clickLinkedImplements() {
		implementlinked.click();
	}
	
	public void clickLinkedTraversal() {
		linked_traversal.click();
	}

	public void clickLinkedInsertions() {
		linked_insertion.click();
	}
	
	public void clickLinkedDeletion() {
		linked_deletion.click();
	}
	
	public void clickLinkedPracise() {
		linked_practice.click();
	}

	
	
}
