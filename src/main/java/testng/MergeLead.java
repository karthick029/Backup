package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;



import week2.day2.wdmethods.Annotations;
import week2.day2.wdmethods.Annotations1;
public class MergeLead extends Annotations1 {

	@Test(timeOut=200)
	public void mergeTask() {
		
		/*startApp("chrome","http://leaftaps.com/opentaps");
		
		WebElement userName=locateElement("id","username");
		type(userName,"DemoSalesManager");
		
		WebElement password=locateElement("id","password");
		type(password,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit");
		click(login);
		
		WebElement crmsfa=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']");
		clickWithoutSS(crmsfa);
		*/
		
		WebElement leads=locateElement("link","Leads");
		clickWithoutSS(leads);
		
		WebElement mergeLead=locateElement("link","Merge Leads");
		clickWithoutSS(mergeLead);
		
		WebElement fromLead=locateElement("(//img[@src='/images/fieldlookup.gif'])[1]");
		clickWithoutSS(fromLead);
		
		switchToWindow(1);
		
		WebElement fromLeadText=locateElement("name","id");
		type(fromLeadText,"10209");
		
		WebElement findLeadsButton=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton);
		
		WebElement firstResultingLead=locateElement("//a[@class='linktext']");
		clickWithoutSS(firstResultingLead);
		
		switchToWindow(0);
		
		WebElement toLead=locateElement("(//img[@src='/images/fieldlookup.gif'])[2]");
		clickWithoutSS(toLead);
		
		switchToWindow(1);
		
		WebElement frmLeadText=locateElement("//div[@class='x-form-element']/input[1]");
		type(frmLeadText,"10209");
		
		WebElement findLeadsButton1=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton1);
		
		WebElement firstResultingToLead=locateElement("//a[@class='linktext']");
		clickWithoutSS(firstResultingToLead);
		
		switchToWindow(0);
		
		WebElement mergeLeadButton=locateElement("class","buttonDangerous");
		clickWithoutSS(mergeLeadButton);
		
		acceptAlert();
		
		WebElement findLeads=locateElement("link","Find Leads");
		click(findLeads);
		
		verifyTitle("Find Leads | opentaps CRM");
		
		WebElement fromLeadTextIcon=locateElement("name","id");
		type(fromLeadTextIcon,"5304434");
		
		WebElement findLeadsBtn=locateElement("//button[text()='Find Leads']");
		click(findLeadsBtn);
		
		WebElement errorMessage=locateElement("class","x-paging-info");
		verifyPartialText(errorMessage,"No records");
		
		//closeBrowser();
	}

}
