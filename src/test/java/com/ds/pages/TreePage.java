package com.ds.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ds.reusable.ReusableAllMethod;

public class TreePage extends ReusableAllMethod{

	public TreePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//body//a[text()='Overview of Trees']")
	WebElement overviewOfTree;
	@FindBy(xpath = "//body//a[text()='Terminologies']")
	WebElement terminology;
	
	@FindBy(xpath = "//body//a[text()='Types of Trees']")
	WebElement TypesOfTree;
	
	@FindBy(xpath = "//body//a[text()='Tree Traversals']")
	WebElement TreeTraversal;
	@FindBy(xpath = "//body//a[text()='Traversals-Illustration']")
	WebElement treeIllusration;
	@FindBy(xpath="//body//a[text()='Binary Trees']")
	WebElement BinaryTree;
	
	@FindBy(xpath = "//body//a[text()='Types of Binary Trees']")
	WebElement TypesOfbinartTree;
	
	@FindBy(xpath = "//body//a[text()='Implementation in Python']")
	WebElement implPython;
	
	@FindBy(xpath = "//body//a[text()='Binary Tree Traversals']")
	WebElement binaryTreeTraversal;
	

	@FindBy(xpath="//body//a[text()='Implementation of Binary Trees']")
	WebElement ImpleBinaryTree;
	
	@FindBy(xpath = "//body//a[text()='Applications of Binary trees']")
	WebElement AplicationbinartTree;
	
	@FindBy(xpath = "//body//a[text()='Binary Search Trees']")
	WebElement BinarySearchtree;
	
	@FindBy(xpath = "//body//a[text()='Implementation Of BST']")
	WebElement ImplementationOfBst;
	
	@FindBy(xpath = "//div[@class='col-sm']/a")
	WebElement Tree_tryhere;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement Tree_introCode;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement tree_intorRun;
	
	public void clickOverviewOfTree() {
		overviewOfTree.click();
		}
		
		
		public void clickTreeTerminology() {
			terminology.click();

	}
		public void clickTypesOfTree() {
			TypesOfTree.click();

	}
		
		public void clickTreeTraversealt() {
			TreeTraversal.click();
		}
		public void navigate() {
			driver.navigate().back();
		}
		
		public void clickTreeIllustration() {
			treeIllusration.click();
		}
		public void clickBinaryTree() {
			BinaryTree.click();
		}
		
		public void typesOfBinaryTree() {
			TypesOfbinartTree.click();
		}

		public void clickImplementaionInPhython() {
			implPython.click();
		}
		
		public void clickBinaryTreeTraversal() {
			binaryTreeTraversal.click();
		}
		
		public void clickImpleBinaryTree() {
			ImpleBinaryTree.click();
		}
		
		
			public void clickAppliBinaryTree() {
				AplicationbinartTree.click();
			}
			
			public void clickBinarySearchTree() {
				BinarySearchtree.click();
			}
			
			public void clickImpleBst() {
				ImplementationOfBst.click();
			}
			
			public void clickTreeTryHere() {
				Tree_tryhere.click();

		}
			public void clickTreeRunIntro() {
				tree_intorRun.click();

		}
			public void enterIntoCodeTreeFeild(String name){
			Tree_introCode.sendKeys(name);
				




}
}
