package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods{
	public ViewAccountPage(EdgeDriver driver) {
		this.driver=driver;
	}
	public void verifyAccountName() {
		WebElement actualAccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
        String getTextAccountName=actualAccountName.getText();
        if(getTextAccountName.contains("Test"))
        {
        	System.out.println("AccountName "+ getTextAccountName +" is correctly created");
        }
        else
        {
        	System.out.println("AccountName "+ "  " + getTextAccountName +" not correctly created");
        }
        
	}

}
