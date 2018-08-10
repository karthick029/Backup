package week5;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html =new  ExtentHtmlReporter("./report/result.html");		
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC01"," CreateLeadFrameWork");
		test.assignCategory("smoke");
		test.assignAuthor("karthick");
		test.pass("username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img1.png").build());
		test.pass("password entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img2.png").build());
		test.pass("login button clicked successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img3.png").build());
		extent.flush();
		

	}

}
