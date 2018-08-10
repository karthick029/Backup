package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases_POM.MyHomePage;

public class TC_003_DeleteLead extends Annotations1 {
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC003_DeleteLead";
		testDesc="Create a lead in Test Leaf";
		iteration="Leads";
		author="karthick";
		category="Smoke";
	    fileName="TC003_DeleteLead_TestCase";
	}
	
	@Test(dataProvider ="fetchData")
	public void deleteLeadTestCase(String firstname)
	{
		new MyHomePage().clickLeads().clickFindLEad().typefirstname(firstname).clickbutton().clickbutton1().clickbutton();
	}


}
