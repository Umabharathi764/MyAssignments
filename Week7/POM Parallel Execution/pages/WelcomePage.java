package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	public WelcomePage(EdgeDriver driver) {
		this.driver=driver;
	} 
	
   public MyHomePage clickCRMSFALink() {
	   driver.findElement(By.linkText("CRM/SFA")).click();
       return new MyHomePage(driver);
	}
   
   public LoginPage logout() {
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    return new LoginPage(driver);
}

}
