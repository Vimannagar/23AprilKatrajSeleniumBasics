package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUsingJS {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();// to maximize the browser
	
	driver.get("https://www.facebook.com/signup");
	
	WebElement firstname = driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].value='text that we want to send';", firstname);
	
	}

}
