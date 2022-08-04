package pageobjectmodel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkout extends SearchProduct
{
	
	
	
	@Test(priority = 3)
	public void clickOnProductAndAdd()
	{
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@data-asin='B097YL5C2G']//*[@class='a-size-medium a-color-base a-text-normal']")).click();
	
		Set<String> allwinid = driver.getWindowHandles();
		
		for(String id:allwinid)
		{
			if(!(id.equals(parent)))
			{
				driver.switchTo().window(id);
			}
			
		}
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='attach-view-cart-button-form']//*[@class='a-button-input']")));
	
		
		driver.findElement(By.xpath("//*[@id='attach-view-cart-button-form']//*[@class='a-button-input']")).click();
	
	
		
		String actualtitle= driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base sc-product-title']")).getText();
	
		
		System.out.println(actualtitle);
	}

}
