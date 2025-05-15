package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class MyAccountsPage extends BaseClass{
	public MyAccountsPage(EdgeDriver driver) {
		this.driver=driver;
	}
     public CreateAccountPage clickCreateAccountLink() {
    	 driver.findElement(By.linkText("Create Account")).click();
    	 return new CreateAccountPage(driver);
     }
}
