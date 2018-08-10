package homework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import week2.day2.wdmethods.WdMethods;

public class Semethodskarthik implements WdMethods  {
	
    public RemoteWebDriver driver ;
    
	public int i=1;

	
	
	public void startapp (String browser ,String url) {
	  
		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		} 
		catch(NoSuchSessionException e)
		{
			System.err.println("No Such Session Exception : Browser not available");
			throw new RuntimeException(); //To close the program 
		} 
		catch (WebDriverException e) {
			System.err.println("WebDriver Exception : Driver not available");
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}

			
	}

	public WebElement locateElement(String locator, String locValue) {
	    
		WebElement ele ;
		try {
			switch (locator) {
			case "id":	
				ele=driver.findElementById(locValue);
				return ele;
			case "class":
				ele=driver.findElementByClassName(locValue);
				return ele;
				
			case "name":
				ele=driver.findElementByName(locValue);
				return ele;
			case "xpath" :
				ele=driver.findElementByXPath(locValue);
				return ele;
				
			case "link":
				ele=driver.findElementByLinkText(locValue);
				return ele;
			}
		}		
		catch (NoSuchElementException e) {
 
		
			System.err.println("NoSuchElementException:elemet not available");
			throw new RuntimeException();
		}

		return null;
	}
	@Override
	public WebElement locateElement(String locValue) {
		WebElement ele1 = null;
		try 
		{
			ele1=driver.findElementByXPath(locValue); //Xpath
			
		}
		catch (NoSuchElementException e) 
		{
			System.err.println("NoSuchElementException :"+locValue+"WebElement not found"); //No such Element Exception
			throw new RuntimeException();
		}
		
		catch (WebDriverException e)
		{
			System.err.println("Browser/driver not found Properly"); //WebDriver exception
			throw new RuntimeException();
		}
		
		return ele1;
	}

	@Override
	public void type(WebElement ele, String data) {
	
		ele.sendKeys(data);
		takeSnap();
		
	}


	@Override
	public void click(WebElement ele) {
	
		ele.click();
		takeSnap();
	}


	@Override
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}


	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select obj =new Select(ele);
		obj.selectByVisibleText(value);
		
	}


	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		
		try 
		{
			Select obj=new Select(ele);
			List<WebElement> lst=obj.getOptions();
			WebElement temp=lst.get(index);
			String text=getText(temp);
			System.out.println(text);
			obj.selectByIndex(index);
		} 
		catch (IndexOutOfBoundsException e) 
		{
			System.err.println("Greater Index value :"+index+"in a WebElement"+ele); 
			throw new RuntimeException(); //To stop the execution
		}
		catch(RuntimeException e)
		{
			System.err.println("Incorrect index selected:"+index+"in a WebElement"+ele);
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
	}


	@Override
	public boolean verifyTitle(String expectedTitle) {
        
		String actualTitle = driver.getTitle();
		String expected =expectedTitle;
		
		if (actualTitle.equals(expected))
		{
			System.out.println("titles are matching "+actualTitle);
			return true;
		}
		
		return false;
	}


	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		String actualText=getText(ele);
		if(actualText.equals(expectedText))
		{
			System.out.println(actualText+" - Text matching successfully");
		}
		else
		{
			System.out.println(actualText+" - Text doesnt matching");
		}
	}


	


	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		String actualtext = getText(ele);
		if(actualtext.contains (expectedText))
		{
			System.out.println(actualtext+"Text Matching");
		}
	}


	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(attribute).equals(value)){
		
		System.out.println("The expectedText Is Matched Successfully");
	}
	else {
		System.out.println("The expectedText Is Not Matched");
	}
	}
	


	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

		boolean partialAttribute=ele.getAttribute(attribute).contains(value);
		if(partialAttribute)
		{
			System.out.println("Attribute is partially matching "+attribute);
		}
		else
		{
			System.out.println("Attribute is not partially matching "+attribute);
		}
	}



	@Override
	public void verifySelected(WebElement ele) {
		
		boolean validation  = ele.isSelected();
		String text = getText(ele);
		if(validation)
		{
			System.out.println(text+"is selected");
		}
		else
		{
			System.out.println(text+"is not selected");
		}
	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		
		if (ele.isDisplayed()) {
			System.out.println();
			
		}else
		{
			System.out.println();
		}
		
	}


	@Override
	public void switchToWindow(int index) {
		
		String currentWindow ="";
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> listwindows = new ArrayList<String>();
			listwindows.addAll(allwindows);
			 currentWindow = listwindows.get(index);
			 driver.switchTo().window(currentWindow);
		}	 catch (IndexOutOfBoundsException e) 
				{
					System.err.println("Greater Window Index value : "+index);
					throw new RuntimeException();
				}
				catch(NoSuchWindowException e)
				{
					System.err.println("Incorrect Window value : "+currentWindow);
					throw new RuntimeException();
				}
			}


	@Override
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}


	@Override
	public void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		String text=getAlertText();
		System.out.println(text);
		alert.accept();
	}

	@Override
	public void dismissAlert() {
		
		Alert alert=driver.switchTo().alert();
		String text=getAlertText();
		System.out.println(text);
		alert.dismiss();
		
	}


	@Override
	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		return text;
	}


	@Override
	public void takeSnap() {
        
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/CreateLeadNewSnaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		i++;
	}
	
	
	

	@Override
	public void closeBrowser() {
          driver.close();		
	}


	@Override
	public void closeAllBrowsers() {
         driver.quit();
		
	}

	public void expWait(WebElement ele)
	{
       WebDriverWait wait = new WebDriverWait(driver,50);
       wait.until(ExpectedConditions.elementToBeClickable(ele));

}

	public void clickWithoutSS(WebElement ele) {		
		expWait(ele);
		ele.click();
				
	}
	
	public void selectWebTable(WebElement ele,int rowIndex,int colIndex)
	{
		List<WebElement> allRows=ele.findElements(By.tagName("tr"));
		WebElement row=allRows.get(rowIndex);
		List<WebElement> allCols=row.findElements(By.tagName("td"));
		WebElement column=allCols.get(colIndex);
		click(column);
	}

	@Override
	public void startApp(String browser, String url) {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
