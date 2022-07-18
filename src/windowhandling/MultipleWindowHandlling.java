package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandlling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		// to get parent window id
		String parentid = driver.getWindowHandle();

		System.out.println(parentid);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> allwindowid = driver.getWindowHandles();
		
//		get number of id available
		
		 int numberofwindow = allwindowid.size();
		 
		 System.out.println(numberofwindow);

		String[] allwinid = new String[numberofwindow];
		
		int i = 0;
		
		for (String id : allwindowid) {
			
			allwinid[i] = id;
			
			i++;
		}
		
		
		driver.switchTo().window(allwinid[1]);
		
		driver.get("https://www.facebook.com/signup");
		
		

	}

}
