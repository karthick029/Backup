package week2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iplsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
	       ChromeDriver driver = new ChromeDriver () ;
	       driver.get("https://www.amazon.com/");
	       driver.manage().window().maximize();
	       driver.findElementById("twotabsearchtextbox").sendKeys("cricketgloves",Keys.ENTER);
	       	       if ( !driver.findElementByXPath("(//input[@type='checkbox'])[11]").isSelected() )
	       {
	    	   driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
	       }
	             	       
	       	    Thread.sleep(5000);	       
	      driver.findElementByXPath("(//h2[@data-attribute='Gray Nicolls Velocity XP1 100 Batting Gloves'])[1]").click();
	      driver.findElementByXPath("(//input[@value='Add to Cart'])[1]").click(); 
	      Thread.sleep(5000);	
	      driver.findElementByXPath("(//a[@role='button'])[11]").click();
	      //driver.close();
	    
	    
	}

}
