package testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
	
	public static  ExtentReports extent;
	public static  ExtentTest suiteTest ,test;
	public String author,category;
	
	public void beginResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	public ExtentTest startTest(String testCaseName, String testDescription) {
		 suiteTest = extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}

	public ExtentTest startTestIteration(String iteration,String author,String category) {	
		 test = suiteTest.createNode(iteration);
		 test.assignAuthor(author);
		 test.assignCategory(category);
		return suiteTest;
	}

	public void reportStep(String desc,String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc);
		}
	}

	public void endResult() {
		extent.flush();
	}

}







