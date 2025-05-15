package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginPage extends BaseClass {
	@Test
	public void runLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton();

	}

}
