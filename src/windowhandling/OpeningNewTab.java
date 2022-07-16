package windowhandling;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewTab {
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();// to maximize the browser
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
//				opening a new tab to the same window
				
				driver.switchTo().newWindow(WindowType.TAB);
				
				
				
//				opening a new window to the same browser
				
				driver.switchTo().newWindow(WindowType.WINDOW);
				
				Set<String> allwindow = driver.getWindowHandles();
				
				for(String winid:allwindow)
				{
					System.out.println(winid);
				}
	}

}
