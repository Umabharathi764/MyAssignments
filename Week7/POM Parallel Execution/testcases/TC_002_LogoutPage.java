package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_LogoutPage extends BaseClass{
	@Test
	public void runLogout() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.logout();

	}

}
