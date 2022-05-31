package com.ds.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class AllureListeners implements ITestListener {
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();

	}

	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		System.out.println("saveFailureScreenShot");
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	}

	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String msg) {
		return msg;

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Inside onStart method : " + context.getName());
		context.setAttribute("WebDriver", BaseTest.getDriver());
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println();
		System.out.println("Inside onFinish method : " + context.getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Inside onTestStart method : " + getTestMethodName(result) + "start");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Inside onTestSuccess method : " + getTestMethodName(result) + "success");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		WebDriver driver = BaseTest.getDriver();
		if (driver instanceof WebDriver) {
			System.out.println("screenshot captured of failed testcase" + getTestMethodName(result));
			saveFailureScreenShot(driver);
			System.out.println("fail");
		}
		saveTextLog(getTestMethodName(result) + "failed testcase screenshot captured ");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Inside onTestSkipped method : " + getTestMethodName(result) + "skipped");

	}
}
