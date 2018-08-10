package week4;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import week2.day2.wdmethods.SeMethods;

public class FacebookSe extends SeMethods{

	@Test
	public void call()
	{
		startApp("chrome","https://www.facebook.com");
		WebElement username = locateElement("xpath", "//input[@data-testid='royal_email']");
		type(username,"karthick619.guru@gmail.com");
		WebElement password = locateElement("xpath", "//input[@data-testid='royal_pass']");
		type(password,"04286280175");
		WebElement login = locateElement("xpath", "//input[@data-testid='royal_login_button']");
		click(login);
		WebElement text =locateElement("xpath","//input[@data-testid='search_input']");
		typewithvar(text,"TestLeaf","Enter");
		WebElement likebutton = locateElement("xpath","(//button[contains(text(),'Like')])[1]");
		 getText(likebutton);
		 verifyExactText(likebutton,"Like");
		 WebElement testleaf = locateElement("xpath","(//div[text()='TestLeaf'])[1]");
		 click(testleaf);
		 WebElement reviews = locateElement("link","Reviews");
		 click(reviews);
		 WebElement reviewcount = locateElement("xpath","(//div[text()='87 reviews'])");
		 String text3 = getText(reviewcount);
		 
		 
		 
			
		
		

	}

}
