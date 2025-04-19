package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

		public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();	
		    options.addArguments("guest");
	        ChromeDriver driver = new ChromeDriver(options);
			driver.get("http://leaftaps.com/opentaps/control/main");		
	        driver.manage().window().maximize();        
	        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");        
	        driver.findElement(By.id("password")).sendKeys("crmsfa");        
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Find Leads")).click();
	        driver.findElement(By.xpath("//span[text()='Phone']")).click();
	        driver.findElement(By.name("phoneCountryCode")).clear();
	        driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
	        driver.findElement(By.name("phoneNumber")).sendKeys("8939483811");
	        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	        
	        Thread.sleep(1000);
	        String leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
            System.out.println("Lead ID is: "+leadID);            
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();   
            driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
            driver.findElement(By.linkText("Find Leads")).click();
            driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
            driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
            Thread.sleep(1000);
    		String output = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
    		System.out.println("After deleting the ID :"+output);
            driver.close();	        

	}

}
