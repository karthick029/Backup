package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
	       ChromeDriver driver = new ChromeDriver () ;
	       driver.get("http://leaftaps.com/opentaps");
	       driver.manage().window().maximize();
	       driver.findElementById("username").sendKeys("DemoSalesManager");
	       driver.findElementById("password").sendKeys("crmsfa");
	       driver.findElementByClassName("decorativeSubmit").click();
	       Thread.sleep(5000);
	       driver.findElementByLinkText("CRM/SFA").click();
	      // driver.findElementByLinkText("Create Lead").click();
	       driver.findElementByXPath("//a[starts-with(text(),'Leads')]").click();
	       driver.findElementByXPath("//a[starts-with(text(),'Find Leads')]").click();
	       driver.findElementByXPath("//body[@class=' ext-safari']").click();Thread.sleep(2000);
	       driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
	       driver.findElementByXPath("//a[starts-with(text(),'Merge Leads')]").click();
	   //    driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	       driver.findElementById("ComboBox_partyIdFrom").sendKeys("10009");
	       driver.findElementById("ComboBox_partyIdTo").sendKeys("10007");
	}

}
