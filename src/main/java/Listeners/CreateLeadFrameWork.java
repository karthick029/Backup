package Listeners;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import week2.day2.wdmethods.Annotations;

import org.openqa.selenium.WebElement;

public class CreateLeadFrameWork extends Annotations{
	
	
	@Test(dataProvider= "fetchdata")
	public void createLead(String cname ,String fname ,String lname) {
		
	/*	startApp("chrome","http://leaftaps.com/opentaps"); //Launch the browser
		
	
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
		type(compName,cname);
		
		WebElement firstName=locateElement("id","createLeadForm_firstName"); //FirstName
		type(firstName,fname);
		
		WebElement lastName=locateElement("id","createLeadForm_lastName"); //LastName
		type(lastName,lname);
		
		WebElement source=locateElement("id","createLeadForm_dataSourceId"); //SourceDropdown
		selectDropDownUsingIndex(source,4);
	
		WebElement industry=locateElement("id","createLeadForm_industryEnumId"); //Industry drop down
		selectDropDownUsingText(industry, "IND_SOFTWARE");
		
		WebElement calendar=locateElement("id","createLeadForm_birthDate-button"); //calendar button
		click(calendar);
		
		WebElement table=locateElement("//div[@class='calendar']"); //select value in webtable
		selectWebTable(table,4,4);
		
		WebElement phoneNumber=locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phoneNumber,"9578184957");
		
		WebElement email=locateElement("id","createLeadForm_primaryEmail");
		type(email,"vichucts@gmail.com");
		
		WebElement submitButton=locateElement("name","submitButton"); //Create lead
		click(submitButton);		
		
		//closeBrowser();
		
	}
	

   @DataProvider(name="fetchdata")
 public Object[][] getData(){
	 Object [][] data = new Object[2][3];
	
	 data[0][0]="cts";
	 data[0][1]="kart";
	 data[0][2]="hick";
	 

	 data[1][0]="cts1";
	 data[1][1]="kart1";
	 data[1][2]="hick2";
	 
	 return data;
 }
	 
 }
 
