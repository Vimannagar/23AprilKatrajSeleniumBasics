package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownUsingFindElements {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://zoom.us/signup");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
	
		driver.findElement(By.xpath("//*[@id='select-2']")).click();
		
		
		List<WebElement> years = driver.findElements(By.xpath("//*[contains(@id,'select-item-select-2-')]"));
		
		for(WebElement year:years)
		{
			String yeartext = year.getText();
			
			System.out.println(yeartext);
		}
		
		
		
	}

}
