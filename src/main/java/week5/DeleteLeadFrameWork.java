package week5;


import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DeleteLeadFrameWork extends Wrapper
{	
	@Test(groups="regression",dependsOnGroups="sanity")
	public void deletelead()
	{
		
		WebElement userName=locateElement("id","username");
		type(userName, "DemoSalesManager");
		
		WebElement pwd=locateElement("id","password");
		type(pwd,"crmsfa");
	
		WebElement login=locateElement("class","decorativeSubmit");
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']");
		expWait(crmsfaLink);
		click(crmsfaLink);
		
		WebElement leadsLink=locateElement("//a[starts-with(text(),'Leads')]");
		click(leadsLink);
		
		WebElement findLeads=locateElement("//a[starts-with(text(),'Find Leads')]");
		click(findLeads);
		
		WebElement Name =locateElement("//span[text()='Name and ID']");
		click(Name);
		
		WebElement firstName=locateElement("(//input[@name='firstName'])[3]"); //FirstName
		type(firstName,"karty");
		
		WebElement findLeadsButton=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton);
		
		WebElement firstResult=locateElement("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		expWait(firstResult);
		click(firstResult);
		
		WebElement deleteButton=locateElement("class","subMenuButtonDangerous");
		click(deleteButton);
		
		WebElement findLeads1=locateElement("//a[starts-with(text(),'Find Leads')]");
		expWait(findLeads1);
		click(findLeads1);
		
		WebElement Name1 =locateElement("//span[text()='Name and ID']");
		click(Name1);
		

		WebElement firstName1=locateElement("(//input[@name='firstName'])[3]"); //FirstName
		type(firstName1,"karty");
		
		WebElement findLeadsButton1=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton1);
		
		WebElement value=locateElement("//div[text()='No records to display']");
		verifyPartialText(value,"No records");
		
	}
		
}
