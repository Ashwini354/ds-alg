package com.sf.account;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class CreateNewView  extends AccountPage{
	public CreateNewView(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//form[@id='editPage']//div[@class='pbHeader']//table//tr//td[@class='pbButtonb']//input[@name='cancel']")WebElement cancel;
	
	@FindBy(xpath = "//input[contains(@data-uidsfdc,'3')]")WebElement save;
	@FindBy(xpath = "//input[@data-uidsfdc='5']")WebElement last_activity_savebut;
	@FindBy(xpath="//input[@id='devname']")WebElement unique_name;
	@FindBy(xpath= "//input[@id='fname']")WebElement name;
	@FindBy(linkText  = "Edit")
	WebElement edit;
	@FindBy(id  = "fcol1")
	WebElement dropdown;
	@FindBy(id  = "fop1")
	WebElement dropdown1;
	@FindBy(id  = "fval1")
	WebElement filter_value;
	@FindBy(id  = "colselector_select_0")
	WebElement last_activity;
	@FindBy(xpath  = "//img[@title='Add']")
	WebElement add;
	@FindBy(xpath  = "colselector_select_0")
	WebElement last_activity_save;
	@FindBys({
		@FindBy(id="colselector_select_1")
	})
	public List<WebElement>check1;
	@FindBy(id = "colselector_select_1")WebElement report_remove;
	@FindBy(id="colselector_select_0_left")WebElement remove_button;
	
	
	@FindBys({
		@FindBy(id="colselector_select_0")
	})
	public List<WebElement>last_activity_add;
	
	@FindBy(id = "colselector_select_0")WebElement last_activity_select;
	@FindBy(id = "colselector_select_0_right")WebElement last_activity_addbutton;
	//@FindBy(id = "//a[normalize-space()='Create New View']")WebElement create_new_veiw;
	
	public void enternameFeild(String userName) throws InterruptedException {
		Thread.sleep(4000);
		enterText(name, userName);

	}

	public void enterIntouUnameFeild(String password) {

		enterText(unique_name, password);

	}
	
	public void clickSaveButton() {
		save.click();
		
	}
	public void clickSaveLastActivityButton() {
		last_activity_savebut.click();
		
	}
	public void clickAdd() {
		add.click();
		
	}
	public void clickVeiwCancel() {
		cancel.click();
		
	}
	public void clickEditButton() {
		edit.click();

	}
	public void clickRemoveButton() {
		remove_button.click();
	}
	public void clickLastCtivitySave() {
		last_activity_save.click();

	}
public void clickAccountName() {
	Select select = new Select(dropdown);
	select.selectByVisibleText("Account Name");
}

public void clickContain() {
	Select select1 = new Select(dropdown1);
	select1.selectByVisibleText("contains");
}
public void clickLastCtivityAddButton() {
	last_activity_addbutton.click();

}
public void enterFilterValue(String password) {

	enterText(filter_value, password);

}

public void lastActivityButtonRemove() {
	
	for(WebElement c1:check1) {
		if(c1.getText().contains("Last Activity")) {
			if(c1.isDisplayed()) {
				///WebElement report_remove=driver.findElement(By.id("duel_select_1"));
				Select select4=new Select(report_remove);
				select4.selectByVisibleText("Last Activity");
				
				clickRemoveButton();
				
			System.out.println("  REMOVED");
			
			
		}
		}
		else {
			System.out.println(" NOT REMOVED");
		}
	}
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
public void clickLastActivityAddButton() throws InterruptedException {
	
	
	for(WebElement drop:last_activity_add) {
		if(drop.getText().contains("Last Activity")) {
			if(drop.isSelected()) {
			System.out.println("ALREADY SELECTED");
		}
	
		else if(!drop.isSelected()) {
			//WebElement dropdown1=driver.findElement(By.id("duel_select_0"));
			
			Select select1=new Select( (WebElement) last_activity_select);
			
			select1.selectByVisibleText("Last Activity");
			System.out.println("REPORTS  SELECTED");
			clickLastCtivityAddButton();
			
		}
			
	}
	
	}
	Thread.sleep(5000);

}
}
