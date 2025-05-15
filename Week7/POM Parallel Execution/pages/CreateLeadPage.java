package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
         return this;
	}
	
public CreateLeadPage enterFirstName() {
		
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
     return this;	
}

public CreateLeadPage enterLastName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
     return this;
}

public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    return new ViewLeadPage();
}

}
