package testngdiscussion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test annotation");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test annotation");
	}
	
	@Test
	public void home()
	{
		System.out.println("Home page of application");
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("Dashboard of application");
	}
	

}
