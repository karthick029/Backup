package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases_POM.MyHomePage;

public class TC_007_CreateContact extends Annotations1 {

	@BeforeTest 
	public void setvalues ()
	{ 

		testCase ="TC_007_createcontct";
		testDesc="create a newcontact in Test Leaf";
		iteration="Leads";
		author="karthick";
		category="Smoke";
		
	    fileName="TC_007_createcontct";
	}
	
	@Test(dataProvider ="fetchData")
	 
	public void CreateContact (String firstname,String lastname,String rowIndex,String colIndex) {
		
		  new MyHomePage().clickcontacts().clickcreatecontact().typefirstname(firstname)
		  .typelastname(lastname).selectWebTable1( rowIndex, colIndex).clicksubmit();	
		  
		  
}}