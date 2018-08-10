package week5;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MergeLeadFrameWork extends Wrapper{
	
	@Test
	public void mergelead()
	{
		
		WebElement userName=locateElement("id","username");
		type(userName,"DemoSalesManager");
		
		WebElement pwd=locateElement("id","password");
		type(pwd,"crmsfa");
		
		WebElement loginButton=locateElement("class","decorativeSubmit");
		click(loginButton);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']");
		expWait(crmsfaLink);
		click(crmsfaLink);
		
		WebElement leadsLink=locateElement("//a[starts-with(text(),'Leads')]");
		click(leadsLink);
		
		WebElement mergeLeadLink=locateElement("//a[text()='Merge Leads']");
		click(mergeLeadLink);
		
		WebElement fromLeadIcon=locateElement("//img[@src='/images/fieldlookup.gif']");
		click(fromLeadIcon);
		
		switchToWindow(1);
		
		WebElement leadId=locateElement("//div[@class='x-form-element']/input[1]");
		type(leadId,"10025");
		
		WebElement findLeadsButton=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton);
		
		WebElement firstResultLead=locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		expWait(firstResultLead);
		clickWithoutSS(firstResultLead);
		
		switchToWindow(0);
		
		WebElement toLeadIcon=locateElement("(//img[@src='/images/fieldlookup.gif'])[2]");
		click(toLeadIcon);
		
		switchToWindow(1);
		
		WebElement leadId1=locateElement("//div[@class='x-form-element']/input[1]");
		type(leadId1,"10027");
		
		WebElement findLeadButton1=locateElement("//button[text()='Find Leads']");
		click(findLeadButton1);
		
		WebElement firstResultLead1=locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		expWait(firstResultLead1);
		clickWithoutSS(firstResultLead1);
		
		switchToWindow(0);
		
		WebElement mergeLead=locateElement("//a[text()='Merge']");
		clickWithoutSS(mergeLead);
		
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		acceptAlert();
	
		WebElement findLeadsLink=locateElement("//a[text()='Find Leads']");
		expWait(findLeadsLink);
		click(findLeadsLink);
		
		WebElement leadId2=locateElement("//div[@class='x-form-item x-tab-item']/div[1]/input[1]");
		type(leadId2,"10015");
		
		WebElement findLeadsButton1=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton1);
		
		WebElement actualMsg=locateElement("//div[text()='No records to display']");
		verifyPartialText(actualMsg,"No records");
	}

}
