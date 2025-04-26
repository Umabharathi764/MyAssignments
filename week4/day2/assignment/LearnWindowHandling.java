package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Handle the popup
		      ChromeOptions options = new ChromeOptions();	
	          options.addArguments("guest");
		        //Initialize ChromeDriver		
				ChromeDriver driver = new ChromeDriver(options);
				//Load URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Maximize window
				driver.manage().window().maximize();
				//Adding Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Enter Username and Password
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");        
		        driver.findElement(By.id("password")).sendKeys("crmsfa");
		        //Click on Login button
		        driver.findElement(By.className("decorativeSubmit")).click();
		        //Click on CRM/SFA link
		        driver.findElement(By.linkText("CRM/SFA")).click();
		        //Click on Contacts
		        driver.findElement(By.linkText("Contacts")).click();
		        //Click on Merge Contacts
		        driver.findElement(By.linkText("Merge Contacts")).click();
		        //Click on widget "From Contact"
		        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		        Thread.sleep(1000);
		        
		        //getWindowHandles to capture all address
				Set<String> allWindows = driver.getWindowHandles();
				//Convert Set into List
				List<String> allAddress = new ArrayList<String>(allWindows);
				System.out.println("The list of all address: "+allAddress);
				
				//transfer the driver focus to child window
				driver.switchTo().window(allAddress.get(1));				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//click on the first resulting contact 
				driver.findElement(By.xpath("//a[@class='linktext']")).click();	
				//Transfer the focus to parent window
				driver.switchTo().window(allAddress.get(0));
				
				//Click on widget "To Contact"
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();	
				
								
				//getWindowHandles to capture all address
				Set<String> bothWindows = driver.getWindowHandles();
				//Convert Set into List
				List<String> bothAddress = new ArrayList<String>(bothWindows);
				System.out.println("The list of all address: "+bothAddress);
				//Transfer the driver focus to child window
				driver.switchTo().window(bothAddress.get(1));				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//click on the second resulting contact 
				driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
				
				driver.switchTo().window(bothAddress.get(0));
				//Click on Merge button
				driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
				//Switch to alert and accept the alert
				driver.switchTo().alert().accept();
				//Verifying the title of the webpage
				String title = driver.getTitle();
				System.out.println("Title of the Webpage is :" +title);				
				
				

	}

}
