package actionsclassdisc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestions {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
	List<WebElement> searchresults = driver.findElements(By.xpath("//*[@class='pcTkSc']//span[text()='selenium']"));
	
				for(WebElement result:searchresults)
				{
					String textofresult = result.getText();
					System.out.println(textofresult);
					
					if(textofresult.equals("selenium webdriver"))
					{
						result.click();
						break;
					}
				}
	
	}

}
