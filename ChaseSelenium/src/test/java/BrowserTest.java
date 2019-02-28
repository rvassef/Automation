import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver/geckodriver");
		
		//System.setProperty("webdriver.gecko.driver", projectPath+ "//drivers/geckodriver/geckodriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/avassef/Documents/workspace/ChaseSelenium/drivers/geckodriver/geckodriver");
		//Users/avassef/Documents/workspace/ChaseSelenium/drivers/geckodriver
		
		
		//WebDriver driver = new FirefoxDriver(); 
		System.setProperty ("webdriver.chrome.driver",projectPath+"/drivers/Chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://chase.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		
		WebElement textbox = driver.findElement(By.name("q"));
		//WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("selenuim");
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		//driver.get("http://chase.com");
		int input;
		int field;
		
		
		
		
		 
	
//		try .
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
		driver.getTitle();
		System.out.println();
		driver.wait(15);
		driver.close();
	    //driver.quit();
		
	}


}
