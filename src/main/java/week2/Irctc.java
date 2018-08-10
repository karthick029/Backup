package week2;


import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
       driver.findElementByPartialLinkText("Sign up").click();
       driver.findElementById("userRegistrationForm:userName").sendKeys("kart");
       driver.findElementById("userRegistrationForm:password").sendKeys("1234");
       driver.findElementById("userRegistrationForm:confpasword").sendKeys("1234");
       WebElement securityDropDown = driver.findElementById("userRegistrationForm:securityQ");
       Select sdd = new Select(securityDropDown);
       List<WebElement>securityOptions= sdd.getOptions();          
       System.out.println("available options in the dropdown is ");
       for(WebElement eachOption:securityOptions)
       {String text =eachOption.getText();
        System.out.println(text);
       }
       sdd.selectByValue("1");
       driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("jackandjill");
       WebElement prefferredlang = driver.findElementById("userRegistrationForm:prelan");
       Select pldd =new Select (prefferredlang);
       pldd.selectByIndex(0);
       driver.findElementById("userRegistrationForm:firstName").sendKeys("kart");
       driver.findElementById("userRegistrationForm:gender").click();
       driver.findElementById("userRegistrationForm:maritalStatus:1").click();
       driver.findElementById("userRegistrationForm:middleName").sendKeys("hick");
       driver.findElementById("userRegistrationForm:lastName").sendKeys("Palanisamy");
       driver.findElementById("userRegistrationForm:gender:0").click();
       driver.findElementById("userRegistrationForm:maritalStatus:0").click();
       WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
       Select ddday = new Select (dobDay);
       ddday.selectByVisibleText("17");
       WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
       Select mmmonth = new Select (dobMonth);
       mmmonth.selectByVisibleText("AUG");	   
       WebElement dateOfBirth = driver.findElementById("userRegistrationForm:dateOfBirth");
       Select year = new Select (dateOfBirth);
       year.selectByVisibleText("1991");
       WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
       Select work =new Select(occupation);
       work.selectByValue("2");
       driver.findElementById("userRegistrationForm:uidno").sendKeys("middlefinger");
       driver.findElementById("userRegistrationForm:idno").sendKeys("Middlefinger");
       WebElement countries = driver.findElementById("userRegistrationForm:countries");
       Select country =new Select(countries);
       country.selectByValue("94");
       driver.findElementById("userRegistrationForm:email").sendKeys("karthick619.guru@gmail.com");
       driver.findElementById("userRegistrationForm:mobile").sendKeys("9952695924");
       WebElement nationalityId = driver.findElementById("userRegistrationForm:nationalityId");
       Select nationality =new Select(nationalityId);
       nationality.selectByValue("94");
       driver.findElementById("userRegistrationForm:address").sendKeys("152 G1 A S pettai ");
       driver.findElementById("userRegistrationForm:pincode").sendKeys("637001",Keys.TAB);
       Thread.sleep(2000);
       WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
       Select city =new Select (cityName);
       city.selectByValue("Namakkal");
       Thread.sleep(2000);
       WebElement postofficeName = driver.findElementById("userRegistrationForm:postofficeName");
       Select postoffice = new Select (postofficeName);
       postoffice.selectByValue("Namakkal Fort S.O");
       driver.findElementById("userRegistrationForm:landline").sendKeys("0428628017");
	}


}
