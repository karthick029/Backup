package week5;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import week2.day2.wdmethods.SeMethods;

public class AdvanceReport  {
	public ExtentTest test ;
	public ExtentReports extent ;	
	String testCaseName, testCaseDesc, category, author;
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		reportStep("Launch Browser Successfully", "pass");
		

	}	
	@BeforeSuite
	public void startResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	@BeforeClass
	public void setData() {
		 testCaseName = "TC001";
		 testCaseDesc="LogIn";
		 category="smoke";
		 author="sarath";		 
	}	
	@BeforeMethod
	public void startTestCase() {
		test = extent.createTest(testCaseName, testCaseDesc);
		test.assignCategory(category);
		test.assignAuthor(author);
	}

	public void reportStep(String desc,String status) {
		try {
			desc=desc+MediaEntityBuilder.
					createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img1.png")
			.build();
			if (status.equalsIgnoreCase("PASS")) {			
				test.pass(desc);
			}else if (status.equalsIgnoreCase("Fail")) {			
				test.fail(desc);
				throw new RuntimeException();
			}else if (status.equalsIgnoreCase("INFO")) {			
				test.info(desc);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void endResult() {
		extent.flush();
	}}