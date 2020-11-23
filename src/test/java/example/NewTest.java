package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://google.com");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Google")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette", true);
			//driver = new FirefoxDriver();  
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  
			driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
