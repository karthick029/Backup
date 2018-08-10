package homework;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2.day2.wdmethods.SeMethods;

public class Mergelead extends SeMethods {
	@Test 
	public void call ()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement uname = locateElement("id","username");
		type(uname,"DemoSalesManager");
		WebElement pwd = locateElement("id","password");
		type(pwd,"crfsms");
		WebElement loginbutton = locateElement("class","decorativeSubmit");
		click(loginbutton);
		
}
	
}