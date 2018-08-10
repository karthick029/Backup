package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class Editleadpage  extends Annotations1{
	
	public Editleadpage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Edit")
	WebElement elebutton;
	
	public Editleadpage clickbutton() {
		click(elebutton);
		return this ;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	WebElement elecname;
	
	public Editleadpage Editcname (String cname) {
		
		type(elecname,cname);
		return this ;
	}
	@FindBy(name="submitButton")
	WebElement elebutton1;
	
	public Editleadpage clickbutton1()
	{
		click(elebutton1);
		return this ;
		
	}	
	
		
	
	}
	
