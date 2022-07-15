package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();// to maximize the browser
				
				driver.get("https://jqueryui.com/resizable/");
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				
//				Switching from parent frame to iframe
				
				driver.switchTo().frame(iframe);
				
				WebElement cornerarrow = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
				
				Actions act = new Actions(driver);
				
				act.clickAndHold(cornerarrow).moveByOffset(30, 80).release().build().perform();
				
	}

}
