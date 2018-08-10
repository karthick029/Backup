package week5;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLeadFrameWork extends Wrapper{
		
	
	@Test(dataProvider="sendData")
	public void createlead(String cname ,String uname , String lname   ) {
		
		
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
		
		WebElement createLead=locateElement("link","Create Lead"); //Click on create lead link
		click(createLead);
		
		WebElement compName=locateElement("id","createLeadForm_companyName"); //CompanyName
		type(compName,cname);
		
		WebElement firstName=locateElement("id","createLeadForm_firstName"); //FirstName
		type(firstName,uname);
		
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
		
		WebElement submitButton=locateElement("name","submitButton"); //Create lead
		click(submitButton);		
		
	}
	
}