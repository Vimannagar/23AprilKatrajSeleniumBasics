package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonListenersTest {
	static WebDriver driver;
	
	WebDriverWait wait;
	
	@Test(priority = 1)
	public void navToURL()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser

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
	
	
	@Test(priority = 3, dependsOnMethods = "searchTest")
	public void clickOnProduct()
	{
		driver.findElement(By.xpath("//*[@data-asin='B097YL5C2G']//*[@class='a-size-medium a-color-base a-text-normal']")).click();
	}

}
