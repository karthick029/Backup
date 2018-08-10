package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");	
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement TVs = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement Samsung = driver.findElementByXPath("//*[@title='Samsung']//following::*[@title='Samsung']");
		Actions builder =new Actions(driver);
		builder.moveToElement(TVs).perform();
		WebDriverWait wait = new WebDriverWait (driver,90);
		wait.until(ExpectedConditions.elementToBeClickable(Samsung));
		builder.click(Samsung).perform();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);				

		WebElement startingprice = driver.findElementByXPath("//*[@class='fPjUPw']");
	    Select minprice =new Select(startingprice);
		minprice.selectByValue("25000");		
		//Thread.sleep(3000);
		WebElement endingprice = driver.findElementByXPath("(//*[@class='fPjUPw'])[2]");
		Select maxprice = new Select(endingprice);
		maxprice.selectByValue("60000");
		//Thread.sleep(3000);
		//driver.findElementByXPath("//div[contains(text(),'Screen Size')]"
		driver.findElementByXPath("//div[text()='Screen Size']").click();
		//Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='48 - 55']").click();	
		//Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']").click();
		//Thread.sleep(3000);
		Set<String> allWindows=driver.getWindowHandles();
		List<String> lstWindows=new ArrayList<String>();
		lstWindows.addAll(allWindows);
		driver.switchTo().window(lstWindows.get(1));
		driver.findElementByXPath("//div[@class='_1p7h2j']").click();
	    driver.close();
		//Thread.sleep(3000);

		Set<String> allWindows1=driver.getWindowHandles();
		List<String> lstWindows1=new ArrayList<String>();
		lstWindows1.addAll(allWindows1);
		driver.switchTo().window(lstWindows1.get(0));
		//Thread.sleep(3000);

		
		driver.findElementByPartialLinkText("Samsung Series 5 124.46cm (49 inch) Full HD LED TV").click();
		
	    
			
		
	}

}
