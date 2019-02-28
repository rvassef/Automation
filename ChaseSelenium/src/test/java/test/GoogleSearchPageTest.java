package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/Chromedriver/chromedriver");
	 driver = new ChromeDriver();
	 
	 GoogleSearchPageObjects searchPageObj  = new GoogleSearchPageObjects(driver);
	 
	 driver.get("https://google.com");
	 
	// Maximize Browser
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 
	 searchPageObj.setTextInSearchBox("A B C D");
	 searchPageObj.clickSearchButton();
	 
	 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	// searchPageObj.setTextInSearchBox("A B C D");
	// searchPageObj.clickSearchButton();
	 
	 
		driver.close();
		System.out.println("Test Passed");
	 
	 //searchPageObj.clickSearchButton();
	 //driver.close();
	 
	 
	}

}
