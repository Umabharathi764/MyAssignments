package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchMenFashionBags {

	public static void main(String[] args) {
		//Handle the popup
	      //ChromeOptions options = new ChromeOptions();	
       // options.addArguments("guest");
	        //Initialize ChromeDriver		
			ChromeDriver driver = new ChromeDriver();
			//Load URL
			driver.get("https://www.ajio.com");
			//Maximize window
			driver.manage().window().maximize();
			//Adding Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Close the location alert
			//driver.findElement(By.id("closeBtn")).click();
			//click on Search box
			WebElement searchBox = driver.findElement(By.name("searchVal"));
			searchBox.click();
			//Enter Bags in search box
			searchBox.sendKeys("bags");
			//Hit Enter
			searchBox.sendKeys(Keys.ENTER);

	}

}
