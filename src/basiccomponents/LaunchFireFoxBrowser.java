package basiccomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		WebDriver driver5 = new FirefoxDriver();
	}

}
