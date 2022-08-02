package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestTagExecutionChrome {
	
	WebDriver driver;

	@Test
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority = 2)
	public void searchTest()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile Phone");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
		String actualtitle = driver.getTitle();
		
		String expectedtitle = "Amazon.in : mobilephone";
		
		
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	
	
	

}
