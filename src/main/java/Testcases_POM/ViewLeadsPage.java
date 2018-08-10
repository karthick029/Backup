package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class ViewLeadsPage extends Annotations1{
	
	public ViewLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_firstName_sp")
	WebElement eleFirstName;
	
	public ViewLeadsPage verifyFirstName(String expName)
	{
		verifyPartialText(eleFirstName, expName);
		return this;
	}
}
