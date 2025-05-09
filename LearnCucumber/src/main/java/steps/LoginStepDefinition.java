package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public EdgeDriver driver;
		
	@Given("Launch the browser")
	public void launch_the_browser() {
		EdgeOptions options = new EdgeOptions();
	    options.addArguments("--disable-notifications");		
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();	    
	}
	
	@And("Wait for few seconds")
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("Load the Url")
	public void load_the_url() {
	    driver.get("http://leaftaps.com/opentaps");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@And("Load the Salesforce Url")
	public void load_the_salesforce_url() {		
		driver.get("https://login.salesforce.com");
	    
	}

	@And("Enter the username as {string}")
	public void enter_the_username_as(String username) {
	    driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	    driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click on the Salesforce Login button")
	public void click_on_the_salesforce_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
	    System.out.println("It navigated to the next page");
	}

	@Then("It should throw error message")
	public void it_should_throw_error_message() {
	    System.out.println("It should throw the error message");
	}
	
	@And("Click on the Toggle Menu from the left corner")
	public void clickToggleMenu() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(500);
	}
	
	@When("Click on View All")
	public void clickViewAll() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(500);
	}
	
	@Then("It should open App Launcher Window")
	public void appLauncherWindow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='App Launcher']")));
	}
	
	@And("Click on Sales")
	public void clickSales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	
	@And("Click on Accounts Tab")
	public void clickAccountsTab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement accountsTab = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.standard-Account']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].ownerDocument.defaultView;", accountsTab);
		wait.until(ExpectedConditions.elementToBeClickable(accountsTab)).click();
	}
	
	@When("Click on New button")
	public void clickNewButton() {
		driver.findElement(By.xpath("//a[@title='New']")).click();
	}
	
	@Then("It should open New Account Window")
	public void newAccountWindow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='New Account']")));
	}
	
	@And("Enter the account name as {string}")
	public void enter_the_account_name_as(String accountname) {
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountname);
	}
	
	@And("Click the Ownership dropdown")
	public void clickOwnershipDropdown() {
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
	}
	
	@And("Select the Ownership as Public")
	public void selectOwnership() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ownership = driver.findElement(By.xpath("//span[text()='Public']"));
		wait.until(ExpectedConditions.elementToBeClickable(ownership)).click();
		
	}	
	
	@When("Click on Save")
	public void clickOnSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(1000);
	}
	
	@Then("Verify the Account Name")
	public void verifyAccountName() {
		WebElement alertMessage  = driver.findElement(By.xpath("//a[@href='javascript:void(0)']//div[1]"));
		String actualText = alertMessage.getText();
		System.out.println("Created Account Name :" + actualText);
		driver.close();
	}
	
}
