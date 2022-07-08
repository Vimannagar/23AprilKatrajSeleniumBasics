package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys("Velocity");
		
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys("Corporate");
		
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("9876543210");
		
		
		
	}

}
