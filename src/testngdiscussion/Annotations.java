package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite annotation");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite annotation");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method annotation");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method annotation");
	}
	
	@Test
	public void checkBoxTest()
	{
		System.out.println("Check box test");
	}
	
	
	@Test
	public void profile()
	{
		System.out.println("profile test");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class annotation");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class annotation");
	}
	
	
	
	
	
}
