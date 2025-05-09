package marathon.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateOpportunity extends BaseClass{
	@BeforeTest
	public void setValues() {
		filename="CreateOpportunity";
	}
	
	@Test(dataProvider = "fetchData")
	public void executeCreateOpportunity(String OpportunityName, String Amount) throws InterruptedException 

      {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
    	driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(500);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='App Launcher']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Sales']"))).click();
				
		WebElement opportunitiesTab = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Opportunity']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].ownerDocument.defaultView;", opportunitiesTab);
		wait.until(ExpectedConditions.elementToBeClickable(opportunitiesTab)).click();
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='New Opportunity']")));
		
		WebElement opportunity = driver.findElement(By.xpath("//input[@name='Name']"));
		opportunity.sendKeys(OpportunityName);
		
		WebElement amt = driver.findElement(By.xpath("//input[@name='Amount']"));
		amt.sendKeys(Amount);
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']/following::button[@name='today']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
				
		WebElement stage = driver.findElement(By.xpath("//div[@aria-label='Stage']//span[text()='Needs Analysis']"));
		wait.until(ExpectedConditions.elementToBeClickable(stage)).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(1000);
		
		WebElement alertMessage  = driver.findElement(By.xpath("//a[@href='javascript:void(0)']//div[1]"));
		String actualText = alertMessage.getText();
		if(actualText.contains("Salesforce"))
		{
			System.out.println("Opportunity " + actualText + " got Created");	
		}
		
		else
		{
			System.out.println("Opportunity " + actualText + " not got Created");	
		}
		

}
}
