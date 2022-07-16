package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleWindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		//to get parent window id
		String parentid = driver.getWindowHandle();
	
		System.out.println(parentid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
//		to get all window id
		
		Set<String> allwindowid = driver.getWindowHandles();
	
		
		
		for(String winid:allwindowid)
		{
			System.out.println(winid);
			
			if(!(parentid.equals(winid)))
			{
//				switching to child id
				driver.switchTo().window(winid);
				
				
			}
			
		}
		
		
		driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();
		
		
		driver.switchTo().window(parentid);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		
		username.sendKeys("Admin");
		
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		
		pwd.sendKeys("admin123");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));

	
		loginbutton.click();
		

	}
}
