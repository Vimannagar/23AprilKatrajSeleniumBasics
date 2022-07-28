package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	@Test(priority = 1, dependsOnMethods = "testngdiscussion.DependsOnMethodKeyword.clickOnLoginButton")
	public void closeBrowser() {
		System.out.println("Close browser test case");
	}
	
	
	@Test(priority = 2)
	public void initiatingWindow() {
		System.out.println("Initiating window test case");
	}

}
