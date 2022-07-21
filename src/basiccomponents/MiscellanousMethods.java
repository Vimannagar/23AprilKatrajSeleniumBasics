package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscellanousMethods {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
driver.get("https://opensource-demo.orangehrmlive.com/");
		

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		
		username.sendKeys("Admin");
		
		username.clear();
		
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		
		pwd.sendKeys("admin123");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));

	
		loginbutton.click();
		
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_18']"));
	
	boolean isclickable = checkbox.isEnabled();
	
	System.out.println(isclickable);//true
	
	boolean isalreadyselected = checkbox.isSelected();
	System.out.println(isalreadyselected);//false
	
	checkbox.click();
	
	boolean afterclickcheck = checkbox.isSelected();
	
	System.out.println(afterclickcheck);//true
	
	boolean isdisplay = checkbox.isDisplayed();
	
	
	System.out.println(isdisplay);// true
	
	
//	getTitle(): 
	
	String pagetitle = driver.getTitle();
	
	System.out.println(pagetitle);//OrangeHRM
	
	
	String currenturl = driver.getCurrentUrl();
	
	System.out.println(currenturl); // this will return the page url
	
	
	
	
	
	
	}

}
