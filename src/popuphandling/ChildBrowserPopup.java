package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://groww.in/");

		WebElement loginbutton = driver.findElement(By.xpath("//*[text()='Login/Register']"));

		loginbutton.click();
		
		Thread.sleep(2000);
		
		WebElement emailfield = driver.findElement(By.xpath("//*[@id='login_email1']"));
		
		emailfield.sendKeys("velocity.ctc@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
		
		
		
		
		
	}

}
