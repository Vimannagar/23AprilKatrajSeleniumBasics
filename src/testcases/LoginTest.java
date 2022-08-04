package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void validateLogin() {

		lp.loginToApplication();
		lp.enterPin();

	}

	@Test
	public void validateTitle() {
		lp.titleOfPage();
	}

}
