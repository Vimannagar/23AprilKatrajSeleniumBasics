package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization3 {
	
WebDriver driver ;
	
	@Parameters("browser")
	@Test
	public void launchURL(String browsername)
	{
		System.out.println("Launching "+browsername+" ...");
		
		if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver",
					"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://www.amazon.in/");
			
	}
	
	

	
	
	
	
	

}
