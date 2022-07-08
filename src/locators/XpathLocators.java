package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		
		username.sendKeys("Admin");
		
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		
		pwd.sendKeys("admin123");
		
		
//		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
//
//	
//		loginbutton.click();
		
		WebElement forgetpasswordlink = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		
		
		forgetpasswordlink.click();
	}

}
