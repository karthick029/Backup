package week5;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import week2.day2.wdmethods.SeMethods;

public class Wrapper extends SeMethods {	
    @Parameters("url")
	@BeforeMethod
	
	public void login(String url ) {
		startApp("chrome", url);
		
		
		
	}
   

	@AfterMethod(groups="common")
	public void close() {
		closeBrowser();
	}

}