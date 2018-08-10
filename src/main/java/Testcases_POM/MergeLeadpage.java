package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class MergeLeadpage extends Annotations1 {
	
	public MergeLeadpage() {
		PageFactory.initElements(driver, this );
	}
    
	@FindBy(xpath="//img[@src='/images/fieldlookup.gif']")
	WebElement elefromlead ;
	
	public MergeLeadpage clickFromlead ()
	{
		click(elefromlead);
		switchToWindow(1);
		return this ;
		
	}
	
	public MergeLeadpage switchto() {
		
		switchToWindow(1);
		return this;
		
	}
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement elefirstname1;
	
	public MergeLeadpage type(String firstname)
	{
	type(elefirstname1,firstname);	
	return this ;
	}
	
	
    
	@FindBy(xpath ="//button[text()='Find Leads']")
	WebElement elefindlead;
	
	public MergeLeadpage click() {
		click(elefindlead);
		return this;
	}
	@FindBy (xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleleadID;
	
	public MergeLeadpage gettext()
	{
		fromleadvalue = getText(eleleadID);
		return this;
		
		
	}
	
	public MergeLeadpage click1() {
		clickWithoutSS(eleleadID);
		switchToWindow(0);
		return this;
		
	}
	
	
  /*   @FindBy(xpath="//input[@name='ComboBox_partyIdFrom']")
	WebElement elefromlead1;
     
     public MergeLeadpage typeLeadIdValue() {
    	 type(elefromlead1, fromleadvalue);
		return this;
     }*/
	
	
	@FindBy(xpath="(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement eletolead ;
	public MergeLeadpage click2() {
		clickWithoutSS(eletolead);
		switchToWindow(1);
		return this;
		
		
	}
	@FindBy (xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")
	WebElement eleleadID1;
	
	public MergeLeadpage click3()
	{
		clickWithoutSS(eleleadID1);
		switchToWindow(0);
		return this;
		
	}
	
/*	@FindBy(xpath="//input[@name='ComboBox_partyIdTo']")
	WebElement eletolead;
     
     public MergeLeadpage typeLeadIdValue1() {
    	 type(eletolead, toleadvalue);
		return this;
     } */ 
	 
     @FindBy(linkText="Merge")
     WebElement elemerge ;
     
     public MergeLeadpage click4() {
    	clickWithoutSS(elemerge);
    	return this ;
     }
     public MergeLeadpage alert() {
    	 acceptAlert();
    	 return this ;}

    	 
     }


