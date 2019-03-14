package test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void setup() {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
	    extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}


	@Test
	public void test1() {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		

		test.log(Status.PASS, "pass");
		// or:
		test.info("Shows info");

		test.log(Status.FAIL, "fail");
		// or:
		


	}
	
	@Test
	public void test2() {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		

		test.log(Status.FAIL, "pass");
		// or:
		test.info("Shows info again");

		test.log(Status.FAIL, "fail");
		// or:
		


	}

	@AfterSuite
	public void tearDown() {
		extent.flush();

	}

}
