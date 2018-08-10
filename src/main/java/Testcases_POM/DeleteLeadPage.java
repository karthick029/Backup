package Testcases_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.Annotations1;

public class DeleteLeadPage extends Annotations1{
	
	public DeleteLeadPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Delete")
	WebElement elebutton;
	
	public DeleteLeadPage clickbutton() {
		click(elebutton);
		return this ;
	}

}
