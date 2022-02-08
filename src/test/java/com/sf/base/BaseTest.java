package com.sf.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.firebase.pages.LoginPage.LoginPage;
import com.firebase.pages.profilePage.CalenderPage;
import com.firebase.pages.profilePage.EmailPage;
import com.firebase.pages.profilePage.HomePage;
import com.firebase.pages.profilePage.SettingPage;
import com.salesforce.utility.GenerateReport;
import com.salesforce.utility.PropertiesConfguration;
import com.sf.Opertunity.OpertunityPage;
//import com.sf.Opertunity.OppertunityPiplinePage;
import com.sf.account.AccountPage;
import com.sf.account.ContactPage;
import com.sf.account.CreateNewView;
import com.sf.account.DatePage;
import com.sf.account.MergeAccount;
import com.sf.leadsPage.LeadPage;
import com.sf.pages.HomePage.ProfilePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Properties prop;
	protected static LoginPage loginPage;
	protected static HomePage homePage;
	protected static ProfilePage profilePage;
	protected static SettingPage settingPage;
	protected static EmailPage emailPage;
	protected static AccountPage accountPage;
	protected static CreateNewView veiw;
	protected static MergeAccount mergeAccount;
	protected static DatePage datePage;
	protected static OpertunityPage oper;
	protected static LeadPage leadPage;
	protected static ContactPage contactPage;
	protected static CalenderPage calenderPage;

	protected static GenerateReport report = GenerateReport.getInstance();
	static {
		prop = PropertiesConfguration.loadProperties();
	}

	@BeforeTest
	public void setUp() {
		report.StartExtentReport();
	}

	public static void Launch(String element) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(element);

	}

	@BeforeMethod()
	public void setup(Method method) {
		report.StartSingleTestReport(method.getName());
		Launch(prop.getProperty("url"));

		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		profilePage = new ProfilePage(driver);
		settingPage = new SettingPage(driver);
		emailPage = new EmailPage(driver);
		accountPage = new AccountPage(driver);
		veiw = new CreateNewView(driver);
		datePage = new DatePage(driver);
		oper = new OpertunityPage(driver);
		mergeAccount = new MergeAccount(driver);
		leadPage = new LeadPage(driver);
		contactPage = new ContactPage(driver);
		calenderPage = new CalenderPage(driver);

	}

//	

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

			String path = takeScreenShot();
			try {
				report.logger.addScreenCaptureFromPath(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
	}

	public static String takeScreenShot() {
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File src_file = screen.getScreenshotAs(OutputType.FILE);
		String file_path = "/Users/ashwiniramamurthy/eclipse-workspace/SalesforsPom/firebase.jpg";
		File des_file = new File(file_path);
		try {
			FileUtils.copyFile(src_file, des_file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/Users/ashwiniramamurthy/eclipse-workspace/SalesforsPom/firebase.jpg";
	}

}
