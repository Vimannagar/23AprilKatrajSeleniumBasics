package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableComponent {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
//		Switching from parent frame to iframe
		
		driver.switchTo().frame(iframe);
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
	
		Actions act = new Actions(driver);
		
		act.clickAndHold(draggable).moveByOffset(20, 60).release(draggable).build().perform();
		
		Thread.sleep(2000);
		
		act.clickAndHold(draggable).moveByOffset(-10, -30).release(draggable).build().perform();
	
//	Switching back to the parent frame:
		
		driver.switchTo().parentFrame();
		
		WebElement hideelementlink = driver.findElement(By.xpath("//*[text()='Hide']"));
		
		act.scrollToElement(hideelementlink).perform();
		
		
		
//		WAP to perform the scrolling using scrollByAmount method
		
		
		
	
	
	
	}

	
//	WAP to handle the droppable (https://jqueryui.com/droppable/) and resizable element (https://jqueryui.com/resizable/)
 
	
//	WAP to handle the date picker component

}
