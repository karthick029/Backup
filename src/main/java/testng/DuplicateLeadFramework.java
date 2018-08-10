package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



import week2.day2.wdmethods.Annotations;
import week2.day2.wdmethods.Annotations1;

import org.openqa.selenium.WebElement;

public class DuplicateLeadFramework extends Annotations1{

	@Test(enabled = false)
	public void duplicateLead()
	{
		/*startApp("chrome","http://leaftaps.com/opentaps"); //Launch the browser
		
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,"DemoSalesManager");
		
		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);
		
		*/
		WebElement leads=locateElement("//a[starts-with(text(),'Leads')]"); //click on leads link
		click(leads);
		
		WebElement findLeads=locateElement("//a[starts-with(text(),'Find Leads')]"); //click on findLeadsLink
		click(findLeads);
		
		WebElement emailLink=locateElement("//span[starts-with(text(),'Email')]"); //click on email link
		click(emailLink);
		
		WebElement emailText=locateElement("name","emailAddress");  //email text on the email text box
		type(emailText,"vichucts@gmail.com");
		
		WebElement findLeadsButton=locateElement("//button[text()='Find Leads']"); //click on find leads button
		click(findLeadsButton);
		
		WebElement firstResultingLead=locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"); //click on find leads button
		expWait(firstResultingLead);
		click(firstResultingLead);
		
		WebElement leadFirstName=locateElement("id","viewLead_firstName_sp"); //get the first name of the lead
		String createdLeadName=getText(leadFirstName);
		verifyExactText(leadFirstName,"Gobi");
		
		WebElement duplicateLead=locateElement("//a[text()='Duplicate Lead']"); //Duplicate lead
		click(duplicateLead); //Duplicate lead icon click
		
		WebElement section=locateElement("id","sectionHeaderTitle_leads"); //Verify duplicate lead title
		verifyExactText(section,"Duplicate Lead"); 
		
		WebElement createLeadBtn=locateElement("//input[@value='Create Lead']"); //Create a duplicate lead
		click(createLeadBtn);
		
		WebElement leadName=locateElement("id","viewLead_firstName_sp"); //Duplicate lead name verification
		verifyExactText(leadName,createdLeadName);
		
		//closeBrowser();
		
	}

}
