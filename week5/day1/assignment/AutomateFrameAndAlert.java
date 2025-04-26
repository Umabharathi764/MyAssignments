package week5.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomateFrameAndAlert {

	public static void main(String[] args) {
		  //Handle the popup
	      ChromeOptions options = new ChromeOptions();	
          options.addArguments("guest");
	        //Initialize ChromeDriver		
			ChromeDriver driver = new ChromeDriver();
			//Load URL
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			//Maximize window
			driver.manage().window().maximize();
			//Adding Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//changing driver focus to frame
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			driver.switchTo().alert().accept();
			WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
			String message = text.getText();
			System.out.println("Text displayed after accepting the alert:" +message);

	}

}
