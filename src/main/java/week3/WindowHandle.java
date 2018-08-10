package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("Webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
       ChromeDriver driver = new ChromeDriver() ;
       driver.manage().window().maximize();
       driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
       driver.findElementByPartialLinkText("Contact Us").click();
       Set<String> allwindows = driver.getWindowHandles();
       int size = allwindows.size();
       System.out.println("allwindowssize"+size);
       List<String> listwindows =new ArrayList<String>();
       listwindows.addAll(allwindows);
       String secwindow = listwindows.get(1);
       driver.switchTo().window(secwindow);
       System.out.println("currenturl"+driver.getCurrentUrl());
       driver.quit();
       
       
}
}