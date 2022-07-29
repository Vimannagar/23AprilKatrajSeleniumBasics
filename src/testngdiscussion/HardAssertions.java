package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	 WebDriver driver;
	@Test(priority = 1)
	public void validateTitle()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://www.facebook.com/signup");
		
		String actualtitle = driver.getTitle();
		
		String expectedtitle = "Sign up for Facebook | Facebook";
		
		
		Assert.assertEquals(actualtitle, expectedtitle, "Test case is failed please file the bug");
		
		System.out.println("After the assertion");
		
		
		
	}
	
	@Test(priority = 2)
	public void testCase2()
	{
		
		String alreadyaccounttext = driver.findElement(By.xpath("//*[text()='Already have an account?']")).getText();
	
		boolean ispresent = alreadyaccounttext.contains("account");
		
	
		Assert.assertTrue(ispresent);
		
		
		
		Assert.assertFalse(true);
	
	
	}
	
	@Test(priority = 3)
	public void testCase3()
	{
		
		Assert.fail("Deliberately failing the test case");
		
	}
	

}
