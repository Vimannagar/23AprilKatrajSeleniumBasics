package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	WebDriver driver ;
	
	@Parameters("urltobelaunch")
	@Test
	public void launchURL(String url)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get(url);
			
	}
	
	

	@Parameters({"mobilename", "expectedtitle"})
	@Test
	public void searchMobile(String nameofmobile, String title)
	{

		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(nameofmobile);
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
		
		String titleofpage = driver.getTitle();
		
		Assert.assertEquals(titleofpage, title);
		
			
	}
	
	

}
