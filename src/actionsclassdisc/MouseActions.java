package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
	
//	double click
		Actions act = new Actions(driver);
		
//		act.doubleClick(doubleclickbutton).perform();
		
//		Hover operation
		
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='sub-menu']"));
	
		act.moveToElement(hoverelement).perform();
		
		WebElement googlelink = driver.findElement(By.xpath("//*[@id='link2']"));
		
		googlelink.click();
		
		
		
//		WAP to perform the hover and click operation on Admin tab of OrangeHRM
		
		
		
	}

}
