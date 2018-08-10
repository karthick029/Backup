package week3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
	       ChromeDriver driver = new ChromeDriver () ;
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();

		
	}

}
