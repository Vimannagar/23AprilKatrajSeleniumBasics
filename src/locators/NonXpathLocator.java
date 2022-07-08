package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonXpathLocator {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//	id locator
//		WebElement	username = driver.findElement(By.id("txtUsername"));
//	
//	
//	username.sendKeys("check typing into the username");
//	
//	
//	WebElement password = driver.findElement(By.id("txtPassword"));
//	
//	password.sendKeys("ajhgsdjfgs\fsdsdfjs");	
	
		
//		name locator
		
		WebElement un = driver.findElement(By.name("txtUsername"));
		
		un.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		
		pwd.sendKeys("admin123");
		
		
//		className locator
		
//		WebElement loginbutton = driver.findElement(By.className("button"));
//		
//		loginbutton.click();
		
//		linkText locator
//	WebElement	link = driver.findElement(By.linkText("Forgot your password?"));
//	
//	link.click();
	
	
//	partialLinkText Locator
	
	WebElement link2 = driver.findElement(By.partialLinkText("gothgdsfg your pa"));
	
	link2.click();
	
//	tagname  locator
	driver.findElement(By.tagName("input"));
	
	}

}
