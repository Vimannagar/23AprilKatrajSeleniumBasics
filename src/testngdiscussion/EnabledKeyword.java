package testngdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword {
	
	
	
	@Test(enabled = false)
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
