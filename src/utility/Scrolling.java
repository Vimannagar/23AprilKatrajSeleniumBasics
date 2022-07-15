package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://jqueryui.com/droppable/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
	
//	perform scrolling operation by pixel value	
		
//		js.executeScript("window.scrollBy(0,1500)");
		
		
		WebElement showelement = driver.findElement(By.xpath("//*[text()='Show']"));
		
//		perform scrolling until a webelement
		
		js.executeScript("arguments[0].scrollIntoView();",showelement);
		
		
		
		
		
		
	}
}
