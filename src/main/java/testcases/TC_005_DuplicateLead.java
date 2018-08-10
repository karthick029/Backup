package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import Testcases_POM.MyHomePage;

public class TC_005_DuplicateLead extends Annotations1{
	
	@BeforeTest
	public void setValues()
	{
		testCase ="TC_005_DuplicateLead";
		testDesc="Duplicate a lead in Test Leaf";
		iteration="Leads";
		author="karthick";
		category="Smoke";
	    fileName="TC003_DeleteLead_TestCase";
	}


	@Test(dataProvider ="fetchData")
   public void Duplicateleadtestcase (String firstname)
   {
	   new MyHomePage().clickLeads().clickFindLEad().typefirstname(firstname).clickbutton().
	   clickbutton3().clickduplicatelead().clickbutton1();
	   
	   
   }
   
	   
  }