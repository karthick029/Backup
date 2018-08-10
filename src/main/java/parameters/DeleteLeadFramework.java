package parameters;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week2.day2.wdmethods.Annotations1;

import org.openqa.selenium.WebElement;

public class DeleteLeadFramework extends Annotations1
{	
	@Test(dataProvider="fetchData")
	
	public void callDelete(int phone1)
	{
		/*startApp("chrome","http://leaftaps.com/opentaps");
		
		WebElement userName=locateElement("id","username");
		type(userName, "DemoSalesManager");
		
		WebElement pwd=locateElement("id","password");
		type(pwd,"crmsfa");
	
		WebElement login=locateElement("class","decorativeSubmit");
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']");
		expWait(crmsfaLink);
		click(crmsfaLink);
	*/	
		WebElement leadsLink=locateElement("//a[starts-with(text(),'Leads')]");
		click(leadsLink);
		
		WebElement findLeads=locateElement("//a[starts-with(text(),'Find Leads')]");
		click(findLeads);
		
		WebElement phone=locateElement("//span[text()='Phone']");
		click(phone);
		
		WebElement phoneNumber=locateElement("//input[@name='phoneNumber']");
		type(phoneNumber,""+phone1);
		
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
		
/*		WebElement phone1=locateElement("//span[text()='Phone']");
		click(phone1);
		
		WebElement phoneNumber1=locateElement("//input[@name='phoneNumber']");
		type(phoneNumber1,"9578184957");
		
		WebElement findLeadsButton1=locateElement("//button[text()='Find Leads']");
		click(findLeadsButton1);
	
		WebElement value=locateElement("//div[text()='No records to display']");
		verifyPartialText(value,"No records");
	*/	
		//closeBrowser();
	}
		

@DataProvider(name="fetchData")
public Object[][] getData()
{
	int row=2;
	int column=1;
	
	Object[][] data= new Object[row][column];
			
	data[0][0]=123343435;
	
	data[1][0]=9843435;
							
	return data;
}

}
