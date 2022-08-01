package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteFailedTestCase {
	
	
	@Test
	public void login()
	{
		System.out.println("Login to the application");
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
		
		throw new NoSuchElementException("element is not available");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout from the application");
	}
	

	@Test(dependsOnMethods = "dashBoard")
	public void profile()
	{
		System.out.println("Profile of an application");
	}
	

}
