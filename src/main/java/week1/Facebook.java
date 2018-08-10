package week1;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver() ;
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       driver.findElementByName("firstname").sendKeys("gill");
	       driver.findElementByName("lastname").sendKeys("kkr");
	       driver.findElementById("u_0_o").sendKeys("9952690023");
	       driver.findElementById("u_0_v").sendKeys("9952690023");
	       WebElement birthDay = driver.findElementById("day");
	       Select Birthday =new Select (birthDay);
	       Birthday.selectByIndex(17);
	       driver.findElementById("u_0_8").click();
	       driver.findElementById("u_0_z").click();
	       			
	       
	}

}
