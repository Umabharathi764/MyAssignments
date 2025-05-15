package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CreateAccountPage extends BaseClass{
	public CreateAccountPage(EdgeDriver driver) {
		this.driver=driver;
	}
	public CreateAccountPage enterAccountName() {
		driver.findElement(By.id("accountName")).sendKeys("Test Account01");
		return this;
	}
	public CreateAccountPage enterDescription() {
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		return this;
	}
	public CreateAccountPage selectIndustry() {
		WebElement indusEnumId=driver.findElement(By.name("industryEnumId"));
        Select indusDropdown = new Select(indusEnumId);
        indusDropdown.selectByVisibleText("Computer Software");
        return this;
	}
	public CreateAccountPage selectOwnership() {
		WebElement ownerShip=driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDropdown = new Select(ownerShip);
        ownershipDropdown.selectByVisibleText("S-Corporation");
        return this;
	}
	public CreateAccountPage selectSource() {
		WebElement source=driver.findElement(By.id("dataSourceId"));
        Select sourceDropdown = new Select(source);
        sourceDropdown.selectByValue("LEAD_EMPLOYEE");
        return this;
	}
	public CreateAccountPage selectMarketingCampaign() {
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
        Select marketingDropdown = new Select(marketing);
        marketingDropdown.selectByIndex(6);
        return this;
	}
	public CreateAccountPage selectStateProvince() {
		WebElement stateProvince=driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateDropdown = new Select(stateProvince);
        stateDropdown.selectByValue("TX");
        return this;
	}
	public AccountDetailsPage clickCreateAccountButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    return new AccountDetailsPage(driver);
	}

}
