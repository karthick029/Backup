package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com");
		driver.findElementByPartialLinkText("Log in").click();
		//   driver.findElementByName("session[username_or_email]").sendKeys("9952695924");
		//  driver.findElementByName("session[password]").sendKeys("");
		driver.findElementByXPath("( //input[@name='session[username_or_email]'])[2]").sendKeys("9952695924");
		driver.findElementByClassName("js-password-field").sendKeys("04286280175");

		driver.findElementByXPath("(//button[@type='submit'])").click();
		driver.findElementById("tweet-box-home-timeline").sendKeys("1");
		//driver.findElementByPartialLinkText("button-text tweeting-text").click();
	//	driver.findElementByXPath("(//span[@class='button-text tweeting-text'][1]").click();
		driver.findElementByPartialLinkText("Tweet").click();
	}
	
}
