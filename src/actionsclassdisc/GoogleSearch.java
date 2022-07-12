package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Selenium");
		
		
		Actions act = new Actions(driver);
		
		
		act.sendKeys(Keys.ENTER).perform();
		
	
		
	}
}
