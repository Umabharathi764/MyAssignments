package week2.day1;

public class Browser {
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully:" +browserName);
		return browserName;
	}
	public void loadUrl() 
	{
		System.out.println( "Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser browser1=new Browser();
		browser1.launchBrowser("Edge");
		browser1.loadUrl();
			
	}

}
