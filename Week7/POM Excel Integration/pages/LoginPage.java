package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String username) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
  public LoginPage enterPassword(String password) {
	  driver.findElement(By.id("password")).sendKeys(password);
      return this;
	}

  public WelcomePage clickLoginButton() {
	  driver.findElement(By.className("decorativeSubmit")).click();
       WelcomePage wp=new WelcomePage(driver);
       return wp;
}

}
