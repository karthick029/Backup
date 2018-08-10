package homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
	       ChromeDriver driver = new ChromeDriver() ;
	       driver.manage().window().maximize();
	       driver.get("https://testleaf.herokuapp.com/pages/checkbox.html");
	       if ( !driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected() )
	       {
	    	   driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
	       }
	       

	}

}
