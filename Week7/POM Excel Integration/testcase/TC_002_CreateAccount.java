package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_002_CreateAccount extends ProjectSpecificMethods{
	@BeforeTest
	public void setValue() {
		filename="CreateAccount";
	}
	@Test(dataProvider="fetchData")
	public void runCreateAccount(String username, String password, String accountname, String description) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountName(accountname)
		.enterDescription(description)
		.selectIndustry()
		.selectOwnership()
		.selectSource()
		.selectMarketingCampaign()
		.selectStateProvince()
		.clickCreateAccountButton()
		.verifyAccountName();
		
	}

}
