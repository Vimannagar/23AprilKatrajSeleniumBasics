package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase {
	
	@Test(groups = {"sanity", "regression"}, priority = 1)
	public void login()
	{
		System.out.println("Login to the application");
	}
	
	
	@Test(groups = "sanity", priority = 2)
	public void home()
	{
		System.out.println("Home page of application");
	}
	
	@Test(groups = {"regression", "functional"}, priority = 3)
	public void dashBoard()
	{
		System.out.println("Dashboard of application");
	}
	
	@Test(groups = {"sanity", "functional"}, priority = 4)
	public void logout()
	{
		System.out.println("Logout from the application");
	}
	

	@Test(groups = "regression", priority = 5)
	public void profile()
	{
		System.out.println("Profile of an application");
	}
	
	@Test(groups = "regression", priority = 6)
	public void admin()
	{
		System.out.println("admin tab");
	}
	

}
