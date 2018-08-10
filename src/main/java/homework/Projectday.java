package homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Projectday {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver() ;
	       driver.manage().window().maximize();
	       driver.get("http://leaftaps.com/opentaps");
	       driver.manage().window().maximize();
	       driver.findElementById("username").sendKeys("DemoSalesManager");
	       driver.findElementById("password").sendKeys("crmsfa");
	       driver.findElementByClassName("decorativeSubmit").click();
	       Thread.sleep(5000);
	       driver.findElementByLinkText("CRM/SFA").click();
	       driver.findElementByPartialLinkText("Create Contact").click();
	       driver.findElementById("firstNameField").sendKeys("kart");
	       driver.findElementById("lastNameField").sendKeys("hick");
	       driver.findElementById("createContactForm_firstNameLocal").sendKeys("karthick");
	       driver.findElementById("createContactForm_lastNameLocal").sendKeys("karthick");
	       driver.findElementById("createContactForm_personalTitle").sendKeys("raja");
	       driver.findElementById("createContactForm_generalProfTitle").sendKeys("VIP");
	       WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
	       Select Rupee = new Select (currency);
	       Rupee.selectByVisibleText("INR - Indian Rupee");
	       driver.findElementById("createContactForm_description").sendKeys("Testleaf");
	       driver.findElementById("createContactForm_importantNote").sendKeys("Testleaf");
	       driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("91");
	       driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("91");
	       driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9952695924");
	       driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("91");
	       driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("kart");
	       driver.findElementById("createContactForm_primaryEmail").sendKeys("karthick619.guru@gmail.com");
	       WebElement text = driver.findElementById("generalToNameField");
	       String actual = text.getText();
	       driver.findElementById("createContactForm_generalAttnName").sendKeys("karthick");
	       driver.findElementById("createContactForm_generalAddress1").sendKeys("namakkal");
	       driver.findElementById("createContactForm_generalAddress2").sendKeys("tamilnadu");
           driver.findElementById("createContactForm_generalCity").sendKeys("namakkal");
           WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
	       Select stat = new Select (state);
	       stat.selectByValue("NY");
	       driver.findElementById("createContactForm_generalPostalCode").sendKeys("637001");
	       driver.findElementByName("submitButton").click();
	  	   WebElement textt = driver.findElementById("viewContact_fullName_sp");
	  	   String expected = textt.getText();
	  	    if(expected.contains(actual)){
	  	        System.out.println("Pass");
	  	    }
	  	        else {
	  	            System.out.println("Fail");
	  	        }
	       driver.findElementById("generalToNameField").click();
	       WebElement marketing = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
	       Select campaign = new Select (marketing);
	       campaign.selectByValue("9002");
           driver.findElementByName("submitButton").click();		       
	}

}
