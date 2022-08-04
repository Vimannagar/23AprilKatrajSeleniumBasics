package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ReadDataFromPropFile;

public class SearchProduct {
	
	WebDriver driver;
	@Test(priority = 1)
	public void navToURL() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser

		String url = ReadDataFromPropFile.readConfigData("testsiteurl");
		
		driver.get(url);
	}
	
	@Test(priority = 2)
	public void searchTest() throws IOException
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(ReadDataFromPropFile.readConfigData("texttosearch"));
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
		String actualtitle = driver.getTitle();
		
//		String expectedtitle = "Amazon.in : mobilephone";
//		
//		
//		Assert.assertEquals(actualtitle, expectedtitle);
	}

}
