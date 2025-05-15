package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethods {
	@BeforeTest
	public void setValue() {
		filename="Login";
	}
	     @Test(dataProvider="fetchData")
		public void runLogin(String username, String password) {
			LoginPage lp=new LoginPage(driver);
			lp.enterUsername(username)
			.enterPassword(password)
			.clickLoginButton();

		}

	}


