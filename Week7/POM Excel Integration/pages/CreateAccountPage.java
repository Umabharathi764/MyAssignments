package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	public CreateAccountPage(EdgeDriver driver) {
		this.driver=driver;
	}
	public CreateAccountPage enterAccountName(String accountname) {
		driver.findElement(By.id("accountName")).sendKeys(accountname);
		return this;
	}
	public CreateAccountPage enterDescription(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
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
	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    return new ViewAccountPage(driver);
	}

}
