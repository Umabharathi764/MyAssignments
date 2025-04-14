package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Demo121");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Umabharathi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Eswar");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("This is for my Testing purpose");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("demotest01@gmail.com");
        WebElement stateProvince=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateProvinceDropdown = new Select(stateProvince);
        stateProvinceDropdown.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Please Note - This is for my testing purpose");
        driver.findElement(By.name("submitButton")).click();
        String title = driver.getTitle();
		System.out.println("Title of the Webpage is:" + title); 
		driver.close();

	}

}
