package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();		
		driver.get("http://leaftaps.com/opentaps");		
        driver.manage().window().maximize();        
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");        
        driver.findElement(By.id("password")).sendKeys("crmsfa");        
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Umabharathi Eswaran06");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        WebElement indusEnumId=driver.findElement(By.name("industryEnumId"));
        Select indusDropdown = new Select(indusEnumId);
        indusDropdown.selectByVisibleText("Computer Software");
        WebElement ownerShip=driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDropdown = new Select(ownerShip);
        ownershipDropdown.selectByVisibleText("S-Corporation");
        WebElement source=driver.findElement(By.id("dataSourceId"));
        Select sourceDropdown = new Select(source);
        sourceDropdown.selectByValue("LEAD_EMPLOYEE");
        WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
        Select marketingDropdown = new Select(marketing);
        marketingDropdown.selectByIndex(6);
        WebElement stateProvince=driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateDropdown = new Select(stateProvince);
        stateDropdown.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        WebElement actualAccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
        String getTextAccountName=actualAccountName.getText();
        if(getTextAccountName.contains("Umabharathi Eswaran06"))
        {
        	System.out.println("AccountName is displayed correctly as"+ "  " + getTextAccountName);
        }
        else
        {
        	System.out.println("AccountName is not displayed correctly as"+ "  " + getTextAccountName);
        }
        
      driver.close();
        
        
        
	}

}
