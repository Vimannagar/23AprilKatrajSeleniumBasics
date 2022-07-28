package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlwaysRunKeyword {
	
	WebDriver driver;

	@Test(priority = 1)
	public void navToUrl() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test(priority = 2, dependsOnMethods = "navToUrl")
	public void enteringCredentials() {
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		username.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));

		pwd.sendKeys("admin123");

		
	}

	@Test(priority = 3, dependsOnMethods = "enteringCredentials")
	public void clickOnLoginButton() {
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submidgdfgt']"));

		loginbutton.click();
	}

	@Test(priority = 4, dependsOnMethods = {"navToUrl","clickOnLoginButton"}, alwaysRun = true)
	public void logout() {
		System.out.println("logout test case");
	}


}
