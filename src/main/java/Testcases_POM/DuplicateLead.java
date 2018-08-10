package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class DuplicateLead  extends Annotations1{
	
	public DuplicateLead () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Duplicate Lead")
	WebElement elebuton ;
	
	public DuplicateLead clickduplicatelead ()
	{
		click(elebuton);
		return this;
		
	}
	@FindBy(name="submitButton")
	WebElement elebutton1;
	
	public DuplicateLead clickbutton1()
	{
		click(elebutton1);
		return this ;
		
	}
	
	
	
	}
	