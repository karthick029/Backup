package week4;

import org.openqa.selenium.WebElement;
import org.junit.Test;

import week2.day2.wdmethods.SeMethods;


import week2.day2.wdmethods.SeMethods;

public class MyntraSe extends SeMethods{
  @Test    
	 public void call ()
	 {
		 startApp("chrome","https://www.myntra.com/");
		 WebElement allGlasses = locateElement("xpath", "(//ul[@class='results-base'])");
		 
		 
			
	 }
}
