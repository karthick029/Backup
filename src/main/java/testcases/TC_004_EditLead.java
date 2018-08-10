package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases_POM.MyHomePage;

public class TC_004_EditLead extends Annotations1 {
	@BeforeTest
	public void setValues()
	{
		testCase ="TC004_EditLead";
		testDesc="edit a lead in Test Leaf";
		iteration="Leads";
		author="karthick";
		category="Smoke";
	    fileName="TC004_EditLead_TestCase";
	}
	
	@Test(dataProvider ="fetchData")
	public void deleteLeadTestCase(String firstname,String cname)
	{
		new MyHomePage().clickLeads().clickFindLEad().typefirstname(firstname).clickbutton().
		clickbutton2().clickbutton().Editcname(cname).clickbutton1();
		
		
	}




}
