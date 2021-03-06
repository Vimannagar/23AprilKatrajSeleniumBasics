package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();// to maximize the browser
	
	driver.get("https://www.facebook.com/signup");
	
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Velocity");
	
	Actions act = new Actions(driver);

	//performing control + a operations	
	 act.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build().perform();
	
	//performing control + c operations	
	
	 
	 act.keyDown(Keys.CONTROL)
	 	.sendKeys("c")
	 	.keyUp(Keys.CONTROL)
	 	.build().perform();
	 
//	 performing control + v operations
	 
	 act.sendKeys(Keys.TAB)
	 	.keyDown(Keys.CONTROL)
	 	.sendKeys("v")
	 	.keyUp(Keys.CONTROL)
	 	.build().perform();
	 

	
	
	
	}
	
}
