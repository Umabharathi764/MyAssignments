package week3.day2;

public class TestData {
	public void enterCredentials()
	{
		System.out.println("Enter the Credentials:");
	}
	public void navigateToHomePage() 
	{
		System.out.println("Navigating to Home Page");
	}

	public static void main(String[] args) {
		TestData testdata = new TestData();
		testdata.enterCredentials();
		testdata.navigateToHomePage();		

	}

}
