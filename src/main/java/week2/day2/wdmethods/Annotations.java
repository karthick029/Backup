package week2.day2.wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Annotations extends SeMethods {
	
//	@Parameters({"url","uname","pwd"})
	//@BeforeMethod
	
	public void login(String url ,String uname, String pwd )throws InterruptedException {
	
       /* startApp("chrome",url); //Launch the browser
		
		WebElement userName=locateElement("id","username"); //Login - username
		type(userName,uname);
		
		//verifyTitle("Leaftaps - TestLeaf Automation Platform");
		//verifyExactAttribute(userName,"id","userName");
		Thread.sleep(3000); //For validation of webDriver exception
		
		WebElement pwd1=locateElement("id","password"); //Login - password
		type(pwd1,pwd);
		
		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);
		
		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink); 
*/
	}
	
	
	@AfterMethod
	public void close() {
		closeAllBrowsers();
	}

}
