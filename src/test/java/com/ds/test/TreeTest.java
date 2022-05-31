package com.ds.test;

import org.testng.annotations.Test;

import com.ds.base.BaseTest;
import com.ds.utlity.ReadingDataFromXl;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class TreeTest extends BaseTest {
	@Description("login page started")
	@Epic("EP001")
	@Feature("featrure1:logo")
	@Story("story:login page")
	@Step("verify login page")
	@Severity(SeverityLevel.NORMAL)

	@Test(dataProviderClass = ReadingDataFromXl.class, dataProvider = "code")

	public static void Test1(String text) throws InterruptedException {
		loginPage.clickgetStarted();
		report.logTestInfo("clicked get started");
		signPage.clickSignin();
		report.logTestInfo("SignIn Button Clicked");
		String username=prop.getProperty("username");
	
		signPage.enterInteUsernameFeild(username);
		report.logTestInfo("username entered");
		String password=prop.getProperty("password");
		signPage.enterIntePasswordFeild(password);
		report.logTestInfo("Password entered");
		signPage.clickLogin();
		report.logTestInfo("Login button clicked");
		homePage.clickTreegetStarted();
		report.logTestInfo("clicked linked list get started");
		
	    treePage.clickOverviewOfTree();
	    report.logTestInfo("Overview of Tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickTreeTerminology();
	    report.logTestInfo("Tree termilnology button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickTypesOfTree();
	    report.logTestInfo("Types of tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickTreeTraversealt();
	    report.logTestInfo("Tree Traversal button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickTreeIllustration();
	    report.logTestInfo(" Tree illustration button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickBinaryTree();
	    report.logTestInfo("Binary Tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.typesOfBinaryTree();
	    report.logTestInfo("Types of Binary Tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickImplementaionInPhython();
	    report.logTestInfo("Implentatiob In Phyton button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickBinaryTreeTraversal();
	    report.logTestInfo("Tree traversal button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickImpleBinaryTree();
	    report.logTestInfo("Impl Of Binary Tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickAppliBinaryTree();
	    report.logTestInfo("Application of binary tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickBinarySearchTree();
	    report.logTestInfo("Binary Search Tree button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	    
	    treePage.clickImpleBst();
	    report.logTestInfo("Implementation of BST button clicked");
	    treePage.clickTreeTryHere();
	    report.logTestInfo("clicked try here button");
	    treePage.enterIntoCodeTreeFeild(text);
	    report.logTestInfo(prop.getProperty("phyon"));
	    treePage.clickTreeRunIntro();
	    report.logTestInfo(prop.getProperty("run"));
	    treePage.navigate();
	

}
}
