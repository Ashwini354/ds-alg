package com.ds.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.ds.pages.GraphPage;
import com.ds.pages.HomePage;
import com.ds.pages.LinkedList;
import com.ds.pages.LoginPage;
import com.ds.pages.SignIn;
import com.ds.pages.TreePage;
import com.ds.utlity.GenerateReport;
import com.ds.utlity.PropertiesConfguration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Properties prop;
	protected static LoginPage loginPage;
	protected static SignIn signPage;
	protected static HomePage homePage;
	protected static LinkedList linkedList;
	protected static TreePage treePage;
	protected static GraphPage graphPage;

	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	protected static GenerateReport report = GenerateReport.getInstance();
	static {
		prop = PropertiesConfguration.loadProperties();
	}

	@BeforeTest
	public void setUp() {
		report.StartExtentReport();
	}

	@org.testng.annotations.Parameters({ "browser" })
	@BeforeClass
	public void Launch(String browser) {
		System.out.println("Before Calss is executing");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		tdriver.set(driver);

		loginPage = new LoginPage(driver);
		signPage = new SignIn(driver);
		homePage = new HomePage(driver);
		linkedList = new LinkedList(driver);
		treePage = new TreePage(driver);
		graphPage = new GraphPage(driver);
	}

	 @org.testng.annotations.Parameters({ "browser" })
	 @BeforeMethod
	public void initialSetUp(String browserName,Method method) {
		 System.out.println("Inside initialSetUp : "+method.getName());
		report.StartSingleTestReport(method.getName());
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	public static void clickOper(WebElement ele) {
		ele.click();

	}

	@AfterTest
	public void endUp() {
		report.endReport();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			report.logTestPass();
		} else if (result.getStatus() == ITestResult.FAILURE) {
			report.logTestFail();
			System.out.println("screen shot taken");
            String path = takeScreenShot(result.getName());
			try {
				report.logger.addScreenCaptureFromPath(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}

	public static String takeScreenShot(String fileName) {
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File src_file = screen.getScreenshotAs(OutputType.FILE);
		String file_path = "/Users/ashwiniramamurthy/eclipse-workspace/ds-alg/"+fileName+"ScreenShot.jpg";
		File des_file = new File(file_path);
		try {
			FileUtils.copyFile(src_file, des_file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file_path;
	}

}
