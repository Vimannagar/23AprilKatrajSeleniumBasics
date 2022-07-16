package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingJS {
	
	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();// to maximize the browser
			
			driver.get("https://zoom.us/signup");
			
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
			driver.findElement(By.xpath("//*[@id='select-0']")).click();
			
			Thread.sleep(3000);
			
			WebElement julymonth = driver.findElement(By.xpath("//*[@id='select-item-select-0-6']"));
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			
			js.executeScript("arguments[0].click();", julymonth);
			
			
//		}

	}

}
