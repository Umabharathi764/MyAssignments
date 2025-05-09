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

public class EditOpportunity extends BaseClass{
	@BeforeTest
	public void setValues() {
		filename="CreateOpportunity";
	}
	
	@Test(dataProvider = "fetchData")
	public void executeEditOpportunity(String OpportunityName, String Amount) throws InterruptedException {
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
		
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Edit')]")));
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//td[@aria-selected='true']/following::td[1]")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		
		WebElement stage = driver.findElement(By.xpath("//div[@aria-label='Stage']//span[text()='Perception Analysis']"));
		wait.until(ExpectedConditions.elementToBeClickable(stage)).click();
		Thread.sleep(1000);
		
		WebElement delivery = driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView();", delivery);
		wait.until(ExpectedConditions.elementToBeClickable(delivery)).click();
		
		driver.findElement(By.xpath("//span[text()='In progress']")).click();
		
		
		Thread.sleep(2000);		
		WebElement descText = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
		wait.until(ExpectedConditions.elementToBeClickable(descText)).click();
		descText.sendKeys("SalesForce");
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(1000);
		
		searchBox.sendKeys(OpportunityName);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement stageOption = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
		String actualText = stageOption.getText();
		if(actualText.contains("Perception"))
		{
			System.out.println("Stage value updated to " + actualText);	
		}
		
		else
		{
			System.out.println("Stage value not updated to " + actualText);	
		}
		
		
	}

}
