package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUsername() {
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
  public LoginPage enterPassword() {
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
      return this;
	}

  public WelcomePage clickLoginButton() {
	  driver.findElement(By.className("decorativeSubmit")).click();
       WelcomePage wp=new WelcomePage(driver);
       return wp;
}

}
