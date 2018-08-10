package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import Testcases_POM.MyHomePage;

public class TC_006_MergeLead extends Annotations1 {

	@BeforeTest 
	public void setvalues ()
	{ 

		testCase ="TC_006_MergeLead";
		testDesc="merge a lead in Test Leaf";
		iteration="Leads";
		author="karthick";
		category="Smoke";
	    fileName="TC_006_MergeLead_TestCase";
		
	}
	@Test(dataProvider ="fetchData")
	public void MergeleadTestcase (String firstname) {
		
		  new MyHomePage()
		  .clickLeads()
		  .clickMergeLead()
		  .clickFromlead()
		  .type(firstname)
		  .click()
		  .gettext()
		  .click1().click2()
		  .type(firstname)
		  .click3()
		  .click4().alert();
		
	}
}
