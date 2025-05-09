package marathon.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteOpportunity extends BaseClass{
	@BeforeTest
	public void setValues() {
		filename="CreateOpportunity";
	}
	
	@Test(dataProvider = "fetchData")
	public void executeDeleteOpportunity(String OpportunityName, String Amount) throws InterruptedException {
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
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		searchBox.sendKeys(OpportunityName);
		Thread.sleep(500);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		searchBox.sendKeys(OpportunityName);
		Thread.sleep(500);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement result=driver.findElement(By.xpath("//span[contains(text(),'0 items')]"));
		String actualText=result.getText();
		if(actualText.contains("0 items"))
		{
			System.out.println("Created opportunity has been deleted successfully");	
		}
		
		else
		{
			System.out.println("Created opportunity has not been deleted successfully");	
		}
		
		
	} 
		

}
