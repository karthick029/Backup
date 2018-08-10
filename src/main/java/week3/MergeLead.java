package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
	       ChromeDriver driver = new ChromeDriver () ;
	       driver.get("http://leaftaps.com/opentaps");
	       driver.manage().window().maximize();
	       driver.findElementById("username").sendKeys("DemoSalesManager");
	       driver.findElementById("password").sendKeys("crmsfa");
	       driver.findElementByClassName("decorativeSubmit").click();
	       Thread.sleep(5000);
	       driver.findElementByLinkText("CRM/SFA").click();
	       driver.findElementByPartialLinkText("Leads").click();
	       driver.findElementByLinkText("Merge Leads").click();
	       driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
	       Set<String> allwindows = driver.getWindowHandles();
	     ///  int size = allwindows.size();
	       List<String> listwindows = new ArrayList<String>();
	       listwindows.addAll(allwindows);
	       String secwindow = listwindows.get(1);
	       driver.switchTo().window(secwindow);
	       driver.manage().window().maximize();
	       driver.findElementByPartialLinkText("10112").click();
	       String primarywindow = listwindows.get(0);
	       driver.switchTo().window(primarywindow);
	      
	       driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	       Set<String> allwindows1 = driver.getWindowHandles();
	    //   int size1 = allwindows1.size();
	       List<String> listwindows1 = new ArrayList<String>();
	       listwindows1.addAll(allwindows1);
	       String secwindow1 = listwindows1.get(1);
	       driver.switchTo().window(secwindow1);
	       driver.manage().window().maximize();
	       driver.findElementByPartialLinkText("10111").click();
	       String primarywindow1 = listwindows.get(0);
	       driver.switchTo().window(primarywindow1);
            driver.findElementByLinkText("Merge").click();
           Alert mergealerts = driver.switchTo().alert();
            mergealerts.accept();
            
            
  
      
	       
	     //  driver.close();
		}
       
	       
	       
	    
	       


	}


