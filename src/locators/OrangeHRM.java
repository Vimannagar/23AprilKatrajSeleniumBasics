package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		
		username.sendKeys("Admin");
		
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		
		pwd.sendKeys("admin123");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));

	
		loginbutton.click();
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
//		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_48']")).click();
		
		for(int i =1; i<45; i++)
		{
			driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		}
		
	}
}
