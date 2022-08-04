package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;

public class BaseTest {
	
	static WebDriver driver;
	
	LoginPage lp;
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
	}
	
	
	@BeforeClass
	public void createObject()
	{
		 lp = new LoginPage(driver);
	}
	
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.quit();
//	}
//	
	
	

}
