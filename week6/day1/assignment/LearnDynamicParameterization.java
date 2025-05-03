package week6.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDynamicParameterization extends LoginStepsClass {
	
	@DataProvider(name="fetchData")
	public String[][] sendData()
	{
		String[][] data = new String[3][2];
		data[0][0]="Salesforce Automation by UserABC";
		data[0][1]="Company01";
		
		data[1][0]="Salesforce Automation by UserDEF";
		data[1][1]="Company02";
		
		data[2][0]="Salesforce Automation by UserXYZ";
		data[2][1]="Company03";
		
		return data;
	}
	
	@Test(dataProvider="fetchData")
	public void run(String legalEntityValue, String companyName) throws InterruptedException
	{
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//button[@Title='App Launcher']")).click();
	    	driver.findElement(By.xpath("//button[text()='View All']")).click();
			Thread.sleep(500);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='App Launcher']")));
			WebElement legalEntity = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", legalEntity);
			wait.until(ExpectedConditions.elementToBeClickable(legalEntity)).click();
			
				
			driver.findElement(By.xpath("//a[@title='New']")).click();	
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='New Legal Entity']")));		
			
			WebElement addLegalEntity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']")));
			addLegalEntity.sendKeys(legalEntityValue);
			
			WebElement addCompanyName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='CompanyName']")));
			addCompanyName.sendKeys(companyName);
			
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();			
					
			WebElement legalEntityName = driver.findElement(By.xpath("(//div[@class='slds-form-element__control']//lightning-formatted-text)[1]"));
			String actualText = legalEntityName.getText(); 
			System.out.println("Legal Enity Name is :" + actualText);
		
	}

}
