package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {
	
	
	 WebDriver driver;
		@Test(priority = 1)
		public void validateTitle()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();// to maximize the browser
			
			driver.get("https://www.facebook.com/signup");
			
			String actualtitle = driver.getTitle();
			
			String expectedtitle = "Signup for Facebook | Facebook";
			
			SoftAssert sa = new SoftAssert();
			
			sa.assertEquals(actualtitle, expectedtitle, "test case failed please file a bug");
			
			
			
			System.out.println("After the assertion");
			
			sa.assertAll();
			
			
			
		}

}
