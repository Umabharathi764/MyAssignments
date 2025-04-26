package week4.day2.classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		
		//Initialize ChromeDriver		
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://www.irctc.co.in/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Adding Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click Flights 		
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
		
		//getWindowHandles to capture all address
		Set<String> allWindows = driver.getWindowHandles();
		
		//Convert Set into List
		List<String> allAddress = new ArrayList<String>(allWindows);
		System.out.println("The list of all address: "+allAddress);
		
		//get the title of parent window
		String titleOfParent = driver.getTitle();
		System.out.println("Title of Parent webpage before Switching:" +titleOfParent);
		
		//transfer the driver focus to child window
		driver.switchTo().window(allAddress.get(1));
		
		//get the title of child window
		String titleOfChild = driver.getTitle();
		System.out.println("Title of Parent webpage after Switching:" +titleOfChild);
		
		//transfer the driver focus to parent window and close it
		driver.switchTo().window(allAddress.get(0));
		driver.close();
		
		
		

	}

}
