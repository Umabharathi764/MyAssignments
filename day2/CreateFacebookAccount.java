package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Umab");
		driver.findElement(By.name("lastname")).sendKeys("rathi");
		driver.findElement(By.name("reg_email__")).sendKeys("9888765441");
		driver.findElement(By.name("reg_passwd__")).sendKeys("may@1234");
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(day);
		dayDropdown.selectByValue("10");
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropdown = new Select(month);
		monthDropdown.selectByVisibleText("May");
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(year);
		yearDropdown.selectByIndex(33);
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		

	}

}
