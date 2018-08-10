package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class MyLeadsPage extends Annotations1{

	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	
	public CreateLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(linkText ="Find Leads")
	WebElement eleFindLead;
	
	public Findleadpage clickFindLEad()
	{ 
		click(eleFindLead);
		return new Findleadpage ();
	}
	
	@FindBy(linkText ="Merge Leads")
	WebElement eleMergeLead;
	
	public MergeLeadpage clickMergeLead()
	{
		click(eleMergeLead);
		return new MergeLeadpage();
		
	}
	
}


