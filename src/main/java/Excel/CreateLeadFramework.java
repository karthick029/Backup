package Excel;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import week2.day2.wdmethods.Annotations2;

import org.openqa.selenium.WebElement;

public class CreateLeadFramework extends Annotations2{

	
	@BeforeTest()
	
	public void beforeTest () {
		
	 
		testCase = "TC001";
		testDesc = "Createlead" ;
	 category = "leads";
	 author ="kart";
	 iteration =""; 
	  	
	}
	
	
	@Test(dataProvider="fetchData")

	public void createLead(String cName,String fName,String lName,String Phone,String emailId) {
		
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


}
