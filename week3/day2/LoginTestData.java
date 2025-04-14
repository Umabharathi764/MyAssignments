package week3.day2;

public class LoginTestData extends TestData{
	public void enterUsername()
	{
		String username = "Demo";
		System.out.println("Enter the Username: " +username);
	}
	public void enterPassword()
	{
		String password = "Test";
		System.out.println("Enter the password: " +password);
	}

	public static void main(String[] args) {
		LoginTestData logintestdata = new LoginTestData();
		logintestdata.enterCredentials();
		logintestdata.enterUsername();
		logintestdata.enterPassword();
		logintestdata.navigateToHomePage();

	}

}
