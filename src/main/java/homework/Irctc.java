package homework;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
	       ChromeDriver driver = new ChromeDriver() ;
	       driver.manage().window().maximize();
	       driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
	       driver.findElementByPartialLinkText("Sign up").click();
	       WebElement countries = driver.findElementById("userRegistrationForm:countries");
	       Select country =new Select(countries);
	       List<WebElement> cntry = country.getOptions();

    	   System.out.println("available options in the dropdown is ");
	       for (WebElement eachcountry : cntry) {
	    	   String text =eachcountry.getText();
	    	   System.out.println(text);
	       }
	       country.selectByValue("94");
			
		} 
	       
           	      
	
	}

