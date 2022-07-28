package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusionOfTestCase {
	
	
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
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout from the application");
	}
	

	@Test
	public void profile()
	{
		System.out.println("Profile of an application");
	}
	
	@Test
	public void admin()
	{
		System.out.println("admin tab");
	}
	
	

}
