package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement alertbutton = driver.findElement(By.xpath("//*[@name='alert']"));

		alertbutton.click();
		
		Thread.sleep(2000);
//		Handling the alert pop up by clicking on ok button
		driver.switchTo().alert().accept();
		
		
	}

}
