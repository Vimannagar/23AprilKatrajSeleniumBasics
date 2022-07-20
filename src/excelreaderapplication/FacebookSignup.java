package excelreaderapplication;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class FacebookSignup {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();// to maximize the browser
				
				driver.get("https://www.facebook.com/signup");
				
				ExcelReader er = new ExcelReader();
				
				String firstname = er.readData(4, 1);
				
				driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]")).sendKeys(firstname);
				
				
				driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]")).sendKeys(er.readData(5, 0));
				
				driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("9876543210");
				
				
				
			}
}
