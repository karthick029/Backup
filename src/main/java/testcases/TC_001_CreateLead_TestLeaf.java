package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import Testcases_POM.MyHomePage;

public class TC_001_CreateLead_TestLeaf extends Annotations1{
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC001_Create Lead";
		testDesc="Create a lead in Test Leaf";
		iteration="Leads";
		author="Vishveshwar";
		category="Smoke";
	    fileName="TC_001_CreateLead_TestCase";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String cName,String fName,String lName)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmit();
	}

}
