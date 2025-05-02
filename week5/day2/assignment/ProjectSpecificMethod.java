package week5.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
@BeforeMethod
	public void preCondition() {
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");		
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("Sales@123");
	driver.findElement(By.id("Login")).click();
}
	

@AfterMethod
    public void postCondition() {
	
	driver.close();		

	}

}
