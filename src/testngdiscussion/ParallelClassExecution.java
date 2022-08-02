package testngdiscussion;

import org.testng.annotations.Test;

public class ParallelClassExecution {
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1 from class 1 ");
	}
	
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2 from class 1 ");
	}

}
