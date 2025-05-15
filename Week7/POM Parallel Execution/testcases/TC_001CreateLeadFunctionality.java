package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass {
	
	@Test
	public void runCreateLead() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyLead();

	}

}

//@Test  @BeforeMethod  @AfterMethod
