package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebpage {

	public static void main(String[] args) {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//Maximize the window
        driver.manage().window().maximize();
        //Enter the Username
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        //Enter the Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Click the Login button
        driver.findElement(By.className("decorativeSubmit")).click();
	}

}
