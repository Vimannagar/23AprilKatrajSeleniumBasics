package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	@Test(invocationCount = 5, priority = 1)
	public void title()
	{
		System.out.println("Title test case ");
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

}
