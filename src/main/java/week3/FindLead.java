package week3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import week2.day2.wdmethods.SeMethods;

public class FindLead extends SeMethods {
	@Test
	public void call()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement uname = locateElement("id","username");
		type(uname,"DemoSalesManager");
		
		WebElement password = locateElement("id","password");
		type(password,"crmsfa");
	    WebElement login  = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crmsfalink = locateElement("link","CRM/SFA");
		click(crmsfalink);
		WebElement leadslink = locateElement("link","Leads");
		click(leadslink);
		WebElement findleads = locateElement("link","Find Leads");
		click(findleads);
		WebElement leadname = locateElement("xpath","(//input[@class=' x-form-text x-form-field'])[25]");
		type(leadname,"Gobi");
		WebElement findleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(findleadbutton);
		WebElement leadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		expWait(leadid);
		
	  //	WebDriverWait wait =new WebDriverWait(driver,10);
	  //  wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@class='linktext'])[4]"))));	
		
	//	Thread.sleep();
	  //  WebElement Createlead = locateElement("link","Create Lead");
	    //click(Createlead);
	   // WebElement sourcedropdown = locateElement("id","createLeadForm_dataSourceId");
	   // selectDropDownUsingIndex(sourcedropdown,4);
	    
	    
	}

}
