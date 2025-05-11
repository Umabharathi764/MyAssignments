package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadPageStepDefinition extends BaseClass {
	public String leadID;
	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click on the Leads link")
	public void click_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click on the CreateLead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Click on the Findleads link")
	public void clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Enter the companyname as (.*)$")
	public void enter_the_companyname_as_test_leaf(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@Given("Enter the firstname as (.*)$")
	public void enter_the_firstname_as_vineeth(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@Given("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_rajendran(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@And("Search the firstname as (.*)$")
	public void enterfirstNameFindLeads(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
	}
	@And("Search the lastname as (.*)$")
	public void enterLastNameFindLeads(String lastName) {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lastName);
	}
	@And("Search the companyname as (.*)$")
	public void enterCompNameFindLeads(String companyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
	}
	@And("Search the Lead ID")
	public void searchLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@Given("Enter the department name as (.*)$")
	public void enterDeptName(String deptName) {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(deptName);
	}
	@Given("Enter the description as (.*)$")
	public void enterDescription(String description) {
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);
	}
	@Given("Enter the email address as (.*)$")
	public void enterEmail(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}
	@And("Select the state province as (.*)$")
	public void selectProvince(String province) {
		WebElement stateProvince=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateProvinceDropdown = new Select(stateProvince);
        stateProvinceDropdown.selectByVisibleText(province);
	}
	@When("Click on the CreateLead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	@When("Click on the FindLeads button")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	   System.out.println("Lead is created");
	}
	@Then("CreatedLead should be displayed")
	public void viewCreatedLead() throws InterruptedException {
		leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
        System.out.println("Created Lead ID is: "+leadID);            
        Thread.sleep(1000);
	}
	@And("Click on LeadID Link")
	public void clickLeadIDLink() {
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click(); 
	}
	@And("Click on Edit button")
	public void clickeditButton() {
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	}	
	@And("Click on Delete button")
	public void clickDeleteButton() {
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	}
	@And("Update the Description as (.*)$")
	public void updateDescription(String description) {
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys(description);
	}
	@And("Update the Important Note as (.*)$")
	public void updateImpNote(String impNote) {
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(impNote);
	}
	@When("Click on Update button")
	public void clickUpdateButton() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	@Then("Validate the Title of the Webpage")
	public void validateWebPageTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the Webpage is:" + title); 
		}
	@Then("Validate the Lead is deleted successfully")
	public void validateLeadDeletion() {
		String output = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		System.out.println("After deleting the ID :"+output);
	}

}
