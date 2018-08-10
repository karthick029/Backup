package week4;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Facebook {
@Test
	public static void Fb() throws InterruptedException {

		
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");	
		ChromeDriver driver = new ChromeDriver(op);
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		   
	       driver.get("https://www.facebook.com");
	       driver.findElementByXPath("//input[@data-testid='royal_email']").sendKeys("karthick619.guru@gmail.com");
	       driver.findElementByXPath("//input[@data-testid='royal_pass']").sendKeys("04286280175");
	       Thread.sleep(2000);

	      //  ChromeOptions ops = new ChromeOptions();
	       // ops.addArguments("--disable-notifications");
		//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       // driver = new ChromeDriver(ops);

	       driver.findElementByXPath("//input[@data-testid='royal_login_button']").click();
	       Thread.sleep(2000);
	       driver.getKeyboard().sendKeys(Keys.ESCAPE);     
	       driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("TestLeaf",Keys.ENTER);
	       
	       WebElement likebutton = driver.findElementByXPath("(//button[contains(text(),'Like')])[1]");
	       String text = likebutton.getText();

	       System.out.println(text);
	       
			if(text.equalsIgnoreCase("Like"))
			{
				
				Thread.sleep(5000);
				likebutton.click();
				driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").click();
			}
			else
			{
				System.out.println("Testleaf already liked");
				driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").click();
			}
	       
 	     
			//driver.findElementByXPath("//div[@data-key='tab_reviews']").click();
			driver.findElementByPartialLinkText("Reviews").click();
			WebElement reviewscount = driver.findElementByXPath("(//div[text()='87 reviews'])");
			String count = reviewscount.getText();
			System.out.println("totalreview  :"+ count);
	       
	       
	}

}
