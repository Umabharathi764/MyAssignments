package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_003_CreateAccount extends BaseClass{
	@Test
	public void runCreateAccount() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountName()
		.enterDescription()
		.selectIndustry()
		.selectOwnership()
		.selectSource()
		.selectMarketingCampaign()
		.selectStateProvince()
		.clickCreateAccountButton()
		.verifyAccountName();
		
	}

}
