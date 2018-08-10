package week2;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadCreation1 {
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
       driver.findElementByLinkText("Create Lead").click();
       driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
       driver.findElementById("createLeadForm_firstName").sendKeys("kart");
       driver.findElementById("createLeadForm_lastName").sendKeys("hick");
      // source drop down 
       WebElement source = driver.findElementById("createLeadForm_dataSourceId");
       Select sdd =new Select(source);
       List<WebElement> alloptions = sdd.getOptions();
       for(WebElement eachoptions:alloptions)
       {
    	   System.out.println(eachoptions.getText());
       }
       int count = alloptions.size();
       sdd.selectByIndex(count-1);
       
       //marketing dropdown 
       WebElement marketingCampaignId = driver.findElementById("createLeadForm_marketingCampaignId");
       Select mdd =new Select (marketingCampaignId);
       List<WebElement> alloption =mdd.getOptions();
        for (WebElement marketingoptions : alloption) {
		System.out.println(marketingoptions.getText());
		}int count1 = alloption.size();
	mdd.selectByIndex(count1-3);
	
       // driver.findElementByClassName("smallSubmit").click();
       //driver.findElementByLinkText("Delete").click();
       
       
       // driver.findElementByPartialLinkText("ext-safari").click();
	}
	}       
       
       
    
       

