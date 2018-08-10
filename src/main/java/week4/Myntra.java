package week4;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Myntra {

	public static void call() {
		
		String url="https://www.myntra.com/";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",Keys.ENTER);;
		
		WebElement allGlasses=driver.findElementByXPath("//ul[@class='results-base']");
		List<WebElement> allGlassNames=allGlasses.findElements(By.className("product-brand"));
		List<String> allGlassNamesTxt=new ArrayList<String>();
		
		for(WebElement each:allGlassNames)
		{
			String text=each.getText();
			allGlassNamesTxt.add(text);
		}
		
		Set<String> uniqueGlassNames=new LinkedHashSet<String>();
		
		for (String each: allGlassNamesTxt) 
		{
			uniqueGlassNames.add(each);
		}
		
		for(String s:uniqueGlassNames)
		{
			System.out.println(s);
		}
		
		System.out.println(uniqueGlassNames.size());	
		
		WebElement discount=driver.findElementByXPath("(//label[@class='common-customRadio vertical-filters-label'])[4]");
		discount.click();
		
		expWait(driver,discount,10);
		
		boolean val=discount.isSelected();
		System.out.println(val);
	
		WebElement filterBox=driver.findElementByXPath("//ul[@class='filter-summary-filterList']/li/div[1]/span");
		String discValue=filterBox.getText();
		
		if(discValue.contains("40%"))
		{
			System.out.println("Filtered successfully");
		}
		
		String totalSunGlass=driver.findElementByXPath("//span[@class='horizontal-filters-sub']").getText();
		//System.out.println(totalSunGlass);
		
		WebElement allUniSexGlasses=driver.findElementByXPath("//ul[@class='results-base']");
		List<WebElement> allUniSexGlassNames=allUniSexGlasses.findElements(By.className("product-product"));
		List<String> allUniSexGlassNamesTxt=new ArrayList<String>();
		
		for(WebElement each:allUniSexGlassNames)
		{
			String text=each.getText();
			allUniSexGlassNamesTxt.add(text);
		}
		
		int count=1;
		String text="Unisex";
		for(String each:allUniSexGlassNamesTxt)
		{
			if(each.contains(text))
				count++;
		}
		
		System.out.println("unisex glass count "+count);
		
		WebElement green=driver.findElementByXPath("//input[@value='green']/..");
		green.click();
		
		WebElement allGreen=driver.findElementByXPath("//ul[@class='results-base']");
		List<WebElement> allGreenNames=allGreen.findElements(By.className("product-base"));
		WebElement secGreenProduct=allGreenNames.get(1); //Second product
		secGreenProduct.click();
		
		WebElement productName=driver.findElementByClassName("pdp-title");
		String prodName=productName.getText();
		System.out.println(prodName);
		
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		
		driver.findElementByXPath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']").click();
		
		String prodNameAdd=driver.findElementByXPath("//div[@class='prod-name']/a[1]").getText();
		
		if(prodName.equalsIgnoreCase(prodNameAdd))
		{
			System.out.println("Product name is matching successfully");
		}
		
	}
	
	public static void expWait(WebDriver driver,WebElement ele,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
}
	