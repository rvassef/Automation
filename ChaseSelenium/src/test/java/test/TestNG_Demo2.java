package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearch;


public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/Chromedriver/chromedriver");
	    driver = new ChromeDriver();
		
		
		
	}
	
	@Test
	public void googleSearch2() {
		
	
		//goto google.com
		
		driver.get("https://google.com");
		
		// Maximize Browser
		
		driver.manage().window().maximize();
		
		// Get page title
		
		
		String actualTitle = driver.getTitle();
		System.out.println("ActualTitle is :" + actualTitle );
		
		if(driver.getTitle().contains("Google"))
			
		    //Pass
		    System.out.println("Page title PASSED");
		else
		    //Fail
			
		    System.out.println("Page title FAILED ");
		
		//enter text in search text box
		
		//driver.findElement(By.name("q")).sendKeys("AUTOMATION STEP BY STEP");
		
		GoogleSearch.textbox_search(driver).sendKeys("Automation Step by Step");
		
		//Click on search button
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.name("btnK")).click();
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearch.button_search(driver).sendKeys(Keys.RETURN);
		
		
		//close browser
		
		
		
	}
	@Test
	public void googleSearch3() {
		
	
		//goto google.com
		
		driver.get("https://google.com");
		
		// Maximize Browser
		
		driver.manage().window().maximize();
		
		// Get page title
		
		
		String actualTitle = driver.getTitle();
		System.out.println("ActualTitle is :" + actualTitle );
		
		if(driver.getTitle().contains("Google"))
			
		    //Pass
		    System.out.println("Page title PASSED");
		else
		    //Fail
			
		    System.out.println("Page title FAILED ");
		
		//enter text in search text box
		
		//driver.findElement(By.name("q")).sendKeys("AUTOMATION STEP BY STEP");
		
		GoogleSearch.textbox_search(driver).sendKeys("Automation Step by Step");
		
		//Click on search button
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.name("btnK")).click();
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearch.button_search(driver).sendKeys(Keys.RETURN);
		
		
		//close browser
		
		
		
	}
		
	@AfterTest	
	public void tearDownTest() {
			 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
			System.out.println("Test Passed");
			
			
		}
		
	}



