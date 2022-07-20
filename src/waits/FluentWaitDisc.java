package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDisc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
	WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
	
//	using fluent wait:
	
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(60))
								.pollingEvery(Duration.ofMillis(9))
								.ignoring(NoSuchElementException.class);
	
	
	
	wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
	
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
	
	
	
	
	}

}
