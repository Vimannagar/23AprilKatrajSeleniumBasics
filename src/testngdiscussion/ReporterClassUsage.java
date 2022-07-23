package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClassUsage {
	
	
	@Test
	public void home()
	{
		System.out.println("Home page of application");
		Reporter.log("Home Test case", true);
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("Dashboard of application");
		Reporter.log("Dashboard Test case", false);
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout from the application");
		Reporter.log("Logout Test case", true);
		
	
	}

}
