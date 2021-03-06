package testngdiscussion;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = -1)
	public void login()
	{
		System.out.println("Login to the application");
	}
	
	
	@Test(priority = -1)
	public void home()
	{
		System.out.println("Home page of application");
	}
	
	@Test(priority = 3)
	public void dashBoard()
	{
		System.out.println("Dashboard of application");
	}
	
	@Test(priority = 1000)
	public void logout()
	{
		System.out.println("Logout from the application");
	}
	

	@Test
	public void profile()
	{
		System.out.println("Profile of an application");
	}
	

}
