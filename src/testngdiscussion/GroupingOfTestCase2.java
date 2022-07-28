package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	
	@Test(groups = {"sanity", "functional"})
	public void viewProfile()
	{
		System.out.println("View profile test case");
	}
	
	
	@Test(groups = "regression")
	public void changeDetails()
	{
		System.out.println("Change details test case");
	}
	
	@Test(groups = {"regression", "sanity"})
	public void handlingWindows()
	{
		System.out.println("Handling windows testcase");
	}
	
	
	}
	


