package marathon.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	public String filename;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
		public void preCondition(String URL, String user, String pass) {
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("Login")).click();
	}
		

	@AfterMethod
	    public void postCondition() {
		
		driver.close();		

		}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		String[][] readdata = ReadExcel.readData(filename);
		return readdata;
		
	}


}
