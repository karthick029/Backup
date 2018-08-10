package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases_POM.MyHomePage;

public class TC_002_CreateLead_Negativecase extends Annotations1{
	@BeforeTest
	public void setValues()
	{
		testCase ="TC002_Create Lead";
		testDesc="Create a lead in Test Leaf with negative validations";
		iteration="Leads";
		author="karthick";
		category="Smoke";
	    fileName="TC_002_CreateLead_Neg_TestCase";
	}
	
	
	
	@Test(dataProvider="fetchData",enabled=false)
	public void createLeadTestCase(String cName,String fName,String lName,String Expected)
	{
		new MyHomePage().clickLeads().clickCreateLead().typeCompanyName(cName)
		.typeFirstName(fName).typeLastName(lName).ClickforSubmiterror().Verifyerrormessage(Expected);
	}

}
