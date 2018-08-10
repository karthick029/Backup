package Testcases_POM;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Excel.Excel;
import Excel.SeMethods1;

public class Annotations2 extends SeMethods1 {
	
	public String excelFileName,testCaseName,testDescription,category,author,moduleName;

	
	@BeforeSuite
	public void startSuite() {
		beginResult();		
		
	}
	
	@BeforeClass
	public void startTest( ) {
		startTest(testCaseName,testDescription);
		
	}
	
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	
	public void login(String url,String uname, String pwd ) throws InterruptedException {
		
		startTestIteration(moduleName,author,category);
        startApp("chrome",url); //Launch the browser
		type(locateElement("id", "username"), uname);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}	
	
	@AfterMethod
	public void close() {
		closeAllBrowsers();
	}
    
	@AfterSuite
	public void stopSuite() {
		endResult();
		
	}
	
	@DataProvider(name="fetchData"/*,indices={0,1}*/)
	public Object[][] getdata() throws IOException
	{
		Excel excel = new Excel();
		return excel.readExcel("Createlead",0);
	 }

	
	 
}
