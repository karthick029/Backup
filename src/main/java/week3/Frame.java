package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		Alert myalerts = driver.switchTo().alert();
		myalerts.sendKeys("kholi");
		myalerts.accept();

		//get the text 
		WebElement textvalidation = driver.findElementById("demo");   
		String actualtext = textvalidation.getText();
		//System.out.println("result"+actualtext);
		 String Expected ="Kholi" ;
		if (actualtext.contains(Expected)) {
			System.out.println("result"+actualtext);
		}
	}
}




