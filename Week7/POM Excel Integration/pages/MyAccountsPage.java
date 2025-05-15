package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethods;

public class MyAccountsPage extends ProjectSpecificMethods{
	public MyAccountsPage(EdgeDriver driver) {
		this.driver=driver;
	}
     public CreateAccountPage clickCreateAccountLink() {
    	 driver.findElement(By.linkText("Create Account")).click();
    	 return new CreateAccountPage(driver);
     }

}
