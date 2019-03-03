package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google Search Test One"," Google Search Functionality");

		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/Chromedriver/chromedriver");
	    driver = new ChromeDriver();
	    
	    test.log(Status.INFO, "Starting Test Case");
	  
	    
	    
	    driver.get("https://google.com");
	    test.pass("Navigated to Google.com");
	    
	    String actualTitle = driver.getTitle();
		System.out.println("ActualTitle is :" + actualTitle );
		
		if(driver.getTitle().contains("Google"))
			
		
		
			//System.out.println("Page title PASSED");
		test.pass("Page title PASSED");
		
		
		
		else
		    //Fail
			
		    //System.out.println("Page title FAILED ");
		
		test.fail("Page title FAILED");
	    
	    driver.findElement(By.name("q")).sendKeys("Automation");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    test.pass("Enter Search in text box");
	   
	    
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    test.pass("Pressed Keyboard");
	    
		driver.manage().window().maximize();
		  test.pass("Browser Maximized");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		 test.pass("Waited 5 Seconds");
	    driver.close();
	    
	    
	    driver.quit();
	    
	    test.pass("Test Completed");
	    extent.flush();
	    
	    		
	    		
	}
	
	

}