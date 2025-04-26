package week5.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnActionsClass {

	public static void main(String[] args) throws InterruptedException {
		//Handle the popup
        ChromeOptions options = new ChromeOptions();	
        options.addArguments("guest");
        //Initialize ChromeDriver		
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://www.amazon.in/");
		//Maximize window
		driver.manage().window().maximize();
		//Adding Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for "oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		//Applying Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-price-whole']")));
		//Getting the price of first product
		WebElement price= driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		WebElement symbol= driver.findElement(By.xpath("//span[@class='a-price-symbol']"));
		String priceValue = price.getText();
		String symbolValue = symbol.getText();
		System.out.println("Price of first product is:" +symbolValue+priceValue);
		// Print the number of customer ratings for the first displayed product
		WebElement firstProduct = driver.findElement(By.xpath("//span[@class='a-declarative']/a[@role='button']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstProduct).perform();
		WebElement rating = driver.findElement(By.xpath("//span[@class= 'a-declarative']//span[@class= 'a-icon-alt']"));
		String ratingValue = rating.getText();
        System.out.println("Customer ratings for the first product: " + ratingValue);
        // Click the first text link of the first image
        WebElement firstProductLink = driver.findElement(By.xpath("//img[@class='s-image']"));
        firstProductLink.click();
        
        //getWindowHandles to capture all address
		Set<String> allWindows = driver.getWindowHandles();
		//Convert Set into List
		List<String> allAddress = new ArrayList<String>(allWindows);
		System.out.println("The list of all address: "+allAddress);
		
		//transfer the driver focus to child window
		driver.switchTo().window(allAddress.get(1));				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Wait for the product page to load
        WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
        addToCartButton.click();
        
      //Take a screenshot of the product displayed
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
        	File destinationFile = new File("screenshot.png");
        	FileUtils.copyFile(screenshot, destinationFile);
        	System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
                
        // Wait for the cart to update
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attach-accessory-cart-subtotal")));
        
        // Get the cart subtotal and verify if it is correct
        WebElement cartSubtotal = driver.findElement(By.id("attach-accessory-cart-subtotal"));
        String cartSubtotalText = cartSubtotal.getText();
        System.out.println("Cart subtotal: " + cartSubtotalText);
                
        // Verify if the cart subtotal matches the price of the product
        if (cartSubtotalText.contains(priceValue)) {
            System.out.println("The cart subtotal is correct.");
        } 
        else
        {
            System.out.println("The cart subtotal is incorrect.");
        }
            driver.quit();
      
	}

}
