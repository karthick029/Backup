package week5;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Areport {

	
	
	public ExtentReports extent;
	public ExtentTest test;
	String testCaseName, testCaseDesc, category, author;

	
    @BeforeSuite
	public void startresult()
	{
		//Module level
		ExtentHtmlReporter html =new  ExtentHtmlReporter("./report/result.html");	
		html.setAppendExisting(true);  //to append the report 
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	@BeforeClass
    public void setdata()
    {
		testCaseName = "TC001";
	 testCaseDesc="LogIn";
	 category="smoke";
	 author="karthik";		 
      
    }
	
	
    }
	

