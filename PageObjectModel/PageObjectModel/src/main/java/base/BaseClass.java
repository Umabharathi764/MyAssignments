package base;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public EdgeDriver driver;
	
	@BeforeMethod
	public void preConditions() {
		driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@AfterMethod
   public void postConditions() {
		driver.close();

	}

}
