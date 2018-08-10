package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;


public class Findleadpage extends Annotations1 {
	
	public Findleadpage() {
		PageFactory.initElements(driver, this);		
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	 WebElement elefirstname;
	
	public Findleadpage typefirstname(String firstname) {
		type(elefirstname,firstname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	 WebElement elebutton;
	
	public Findleadpage clickbutton() {
		click(elebutton);		
		return this;
	}
    
	@FindBy(linkText="kart")
	WebElement elename ;
	
	public DeleteLeadPage clickbutton1() {
		click(elename);
		return new DeleteLeadPage () ;
	}
	
	@FindBy(linkText="kart")
	WebElement elename1 ;
	
	public Editleadpage clickbutton2() {
		click(elename1);
		return new Editleadpage () ;
	}
	@FindBy(linkText="kart")
	WebElement elename2 ;
	
	public DuplicateLead clickbutton3() {
		click(elename2);
		return new DuplicateLead () ;
	}
}
