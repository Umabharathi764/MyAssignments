package week6.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnStaticParameterization extends LoginStepsClass {
	@Test
	public void executeLearnAnnotation() throws InterruptedException 

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
		WebElement addCompanyName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='CompanyName']")));
		addCompanyName.sendKeys("TestLeaf");
		
		WebElement addDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']/textarea[@class='slds-textarea'])[2]")));
		addDesc.sendKeys("Salesforces");
		
		WebElement selectStatus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']")));
		JavascriptExecutor status = (JavascriptExecutor) driver;
		status.executeScript("arguments[0].scrollIntoView({block: 'center'});", selectStatus);
		selectStatus.click();
		
		driver.findElement(By.xpath("//div[@class='slds-combobox_container']//div[@aria-label='Status']/lightning-base-combobox-item[@data-value='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		WebElement errordialog = driver.findElement(By.xpath("//button[@title='Close error dialog']"));
		errordialog.click();
		
		WebElement alertMessage = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));
		String actualText = alertMessage.getText(); 
		String message=actualText.substring(17);
		System.out.println("Alert Message displayed is :" + message);

	}

}
