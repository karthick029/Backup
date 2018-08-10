package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class Createcontactpage extends Annotations1 {
	
	
	public Createcontactpage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Create Contact")
	WebElement eleCreatecontact;
	
	public Createcontactpage clickcreatecontact() {
		click(eleCreatecontact);
		return this ;
		
		
	}
	
	
	@FindBy(id="firstNameField")
	WebElement elefirstname;
	public Createcontactpage typefirstname (String firstname) {
		
		type(elefirstname,firstname);
		return this;
		
	}
	
	@FindBy(id="lastNameField")
	WebElement elelastname;
	public Createcontactpage typelastname (String lastname ) {
		type (elelastname,lastname);
		return this;
	}
   @FindBy(id="createContactForm_birthDate-button")
   WebElement elebirthdate;
   
   public   Createcontactpage selectWebTable1(String rowIndex,String colIndex) 
   {
	    
	   selectWebTable(elebirthdate,rowIndex,colIndex);
	return this;
	   
	   
   }
   @FindBy(xpath="(//input[@class='smallSubmit'])")
   WebElement elesubmit ;
   
   public Createcontactpage clicksubmit()
   {
	   
	   click(elesubmit);
	   return this ;
			   
   }
}
