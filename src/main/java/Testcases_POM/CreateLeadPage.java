package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class CreateLeadPage extends Annotations1{

	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(eleCompanyName,cName);
		return this;
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	
	public CreateLeadPage typeFirstName(String fName)
	{
		type(eleFirstName,fName);
		return this;
	}
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	
	public CreateLeadPage typeLastName(String lName)
	{
		type(eleLastName,lName);
		return this;
	}
	
	@FindBy(className="errorList")
	WebElement eleerrorlist;
	
	public CreateLeadPage Verifyerrormessage (String Expected)
	{
		verifyPartialText(eleerrorlist,Expected);
		return this ;
		
	}
	
	
	@FindBy(name="submitButton")
	WebElement submitButton;
	
    public CreateLeadPage ClickforSubmiterror()
    {

		click(submitButton);
		return this;
	
    }
    
    
	
	public CreateLeadPage clickSubmit()
	{
		click(submitButton);
		return new CreateLeadPage();
	}
	
}

