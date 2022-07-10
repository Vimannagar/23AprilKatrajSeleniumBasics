package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownHandlingUsingFindElements {
	
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		for( WebElement day:dayvalues)
		{
			String dayvalue = day.getText();
			
			System.out.println(dayvalue);
			
			if(dayvalue.equals("20"))
			{
				day.click();
				break;
			}
			
			
		}
		
	}

}
