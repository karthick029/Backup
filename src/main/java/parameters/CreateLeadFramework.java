package parameters;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week2.day2.wdmethods.Annotations1;

import org.openqa.selenium.WebElement;

public class CreateLeadFramework extends Annotations1{

	@Test(dataProvider="fetchData")
	
	public void createLead(String cName,String fName,String lName,int Phone,String emailId) {
		
		/*startApp("chrome","http://leaftaps.com/opentaps"); //Launch the browser
		
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,"DemoSalesManager");
		
		//verifyTitle("Leaftaps - TestLeaf Automation Platform");
		//verifyExactAttribute(userName,"id","userName");
		//Thread.sleep(2000); //For validation of webDriver exception
		
		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,"crmsfa");
		
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);
		*/
		WebElement createLead=locateElement("link","Create Lead"); //Click on create lead link
		click(createLead);
		
		WebElement compName=locateElement("id","createLeadForm_companyName"); //CompanyName
		type(compName,cName);
		
		WebElement firstName=locateElement("id","createLeadForm_firstName"); //FirstName
		type(firstName,fName);
		
		WebElement lastName=locateElement("id","createLeadForm_lastName"); //LastName
		type(lastName,lName);
		
		WebElement source=locateElement("id","createLeadForm_dataSourceId"); //SourceDropdown
		selectDropDownUsingIndex(source,4);
	
		WebElement industry=locateElement("id","createLeadForm_industryEnumId"); //Industry drop down
		selectDropDownUsingText(industry, "IND_SOFTWARE");
		
		WebElement calendar=locateElement("id","createLeadForm_birthDate-button"); //calendar button
		click(calendar);
		
		WebElement table=locateElement("//div[@class='calendar']"); //select value in webtable
		selectWebTable(table,4,4);
		
		WebElement phoneNumber=locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phoneNumber,""+Phone);
		
		WebElement email=locateElement("id","createLeadForm_primaryEmail");
		type(email,emailId);
		
		WebElement submitButton=locateElement("name","submitButton"); //Create lead
		click(submitButton);		
		
		//closeBrowser();
		
	}

	@DataProvider(name="fetchData",indices={0,1})
	public Object[][] getData()
	{
		int row=2;
		int column=5;
		
		Object[][] data= new Object[row][column];
				
		data[0][0]="Test leaf";
		data[0][1]="Babu";
		data[0][2]="M";
		data[0][3]=123343435;
		data[0][4]="babu@testleaf.com";
		
		data[1][0]="Test leaf";
		data[1][1]="Gayathri";
		data[1][2]="S";
		data[1][3]=9843435;
		data[1][4]="Gayathiri3@testleaf.com";
								
		return data;
	}

}
