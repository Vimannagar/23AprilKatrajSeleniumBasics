package testngdiscussion;

import org.testng.annotations.Test;

public class BasicTestCase {
	
	
	@Test
	public void testCase1()
	{
		System.out.println("testcase 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("testcase 2");
		
		throw new NullPointerException("fail kiya hua test case");
	}
	
	

}
