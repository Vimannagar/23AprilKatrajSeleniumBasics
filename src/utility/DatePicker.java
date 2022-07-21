package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();// to maximize the browser
				
				driver.get("https://jqueryui.com/datepicker/");
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				
//				Switching from parent frame to iframe
				
				driver.switchTo().frame(iframe);
				
				
				driver.findElement(By.xpath("//*[@id='datepicker']")).click();
				
				while(true)
				{
					
					String monthyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
							
					System.out.println(monthyear);
					
					if(!(monthyear.equals("August 2021")))
					{
						driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					}
					
					else
					{
						break;
					}
					
				}
				
				driver.findElement(By.xpath("//td[@data-handler='selectDay']//*[text()='13']")).click();
				
				
//		WAP to select the date month and year with respect to the value given by user
		
	}

}
