package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDisc {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		
		
//		wait till the element is clickable
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//	wait till the element is visible over the page
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		WebElement invisiblebutton = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		wait.until(ExpectedConditions.visibilityOf(invisiblebutton));
		
		driver.findElement(By.xpath("//*@[id='display-other-button']")).click();
		
		
//		Assignments:
//		WAP to handle the checkbox selection state to be true
//		WAP to handle the text present over the page
//		WAP to handle the alert pop up
		
		
		
		
	}

}
