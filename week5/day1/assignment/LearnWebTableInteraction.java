package week5.day1.assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTableInteraction {

	public static void main(String[] args) {
		    //Handle the popup
	        ChromeOptions options = new ChromeOptions();	
            options.addArguments("guest");
	        //Initialize ChromeDriver		
			ChromeDriver driver = new ChromeDriver();
			//Load URL
			driver.get("https://erail.in/");
			//Maximize window
			driver.manage().window().maximize();
			//Adding Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Enter From Station
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).click();
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys(Keys.ENTER);
			//Enter To Station
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).click();
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
			driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys(Keys.ENTER);
			//Uncheck Sort on Date
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			//Retrieve Train names
			List<WebElement> columnValue =driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
			int numberOfTrain = columnValue.size();
			System.out.println("Number of Trains between MAS and MDU:" +numberOfTrain);
			System.out.println("Train Names between MAS and MDU:");
			//use for loop to retrieve train names
			for (int i=0; i<columnValue.size(); i++)
			{
				String text = columnValue.get(i).getText();
				System.out.println(text);
			}
			Set<String> originalTrainNames = new HashSet<>();
			Set<String> duplicateTrainNames = new HashSet<>();

			for (WebElement train : columnValue) {
				String name = train.getText().trim();
			    if (!originalTrainNames.add(name)) {
			    	duplicateTrainNames.add(name);
			    }
			}
			System.out.println("Duplicate train names: " + duplicateTrainNames);
			
				}
	
	}


