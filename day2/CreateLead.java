package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();		
		driver.get("http://leaftaps.com/opentaps");		
        driver.manage().window().maximize();        
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");        
        driver.findElement(By.id("password")).sendKeys("crmsfa");        
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Umabharathi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Eswar");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QE Lead");
        driver.findElement(By.name("submitButton")).click();
        WebElement leadTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
        String actualLeadTitle=leadTitle.getText();
        if(actualLeadTitle.contains("QE Lead"))
        {
        	System.out.println("Title is displayed correctly as"+ "  " + actualLeadTitle);
        }
        else
        {
        	System.out.println("Title is not displayed correctly as"+ "  " + actualLeadTitle);
        }
        
      driver.close();
        
	}

}
