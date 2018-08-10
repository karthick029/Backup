package Excel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week2.day2.wdmethods.Annotations1;


public class EditLeadFramework extends Annotations1{

	@Test
	public void doEdit() throws InterruptedException
	{
	/*	WebElement userName=locateElement("id","username"); //Login - username
		type(userName,"DemoSalesManager");

		WebElement pwd=locateElement("id","password"); //Login - password
		type(pwd,"crmsfa");

		WebElement login=locateElement("class","decorativeSubmit"); //Login - login button
		click(login);

		WebElement crmsfaLink=locateElement("//img[@src='/opentaps_images/integratingweb/crm.png']"); //Click - crmsfa link
		click(crmsfaLink);*/

		click(locateElement("link","Leads"));
		click(locateElement("link","Find Leads"));
		type(locateElement("(//input[@name='firstName'])[3]"), "Gopinath");
		click(locateElement("//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		click(locateElement("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("//a[contains(text(),'Edit')]"));
		WebElement dropDown=locateElement("id", "updateLeadForm_industryEnumId");
		selectDropDownUsingText(dropDown, "IND_SOFTWARE");
		click(locateElement("//input[@class='smallSubmit']"));

	}


}
