package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	public MyHomePage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public MyAccountsPage clickAccountsLink() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountsPage(driver);
	}

}
