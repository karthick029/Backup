package week2.day2.wdmethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Excel.Excel;
import Excel.SeMethods1;
import testcases.ReadExcel;

public class Annotations2 extends SeMethods1 {
	

	public String testCase, testDesc, iteration, author, category, fileName;
	
	@BeforeSuite
	public void start()
	{
		beginResult();
	}
	
	@BeforeClass
	public void testStart()
	{
		startTest(testCase, testDesc);
		startTestIteration(iteration,author,category);
	}
	
	@Parameters({"url","uName","pwd"})
	@BeforeMethod()
	public void login(String url,String uName,String password)
	{
		startApp("chrome",url); //Launch the browser
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,uName);
		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,password);
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);
	
	}
	
	@AfterMethod()
	public void close()
	{
		closeBrowser();
		endResult();
	}
	
	/*@AfterSuite
	public void doFlush()
	{
		
	}*/

	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcel excel=new ReadExcel();
		return excel.readExcel(fileName);
	}
}
