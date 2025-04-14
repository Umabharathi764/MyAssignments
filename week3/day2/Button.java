package week3.day2;

public class Button extends WebElement{
	public void submit() 
	{
		System.out.println("Clicking the Submit button");
	}

	public static void main(String[] args) 
	{
		Button button = new Button();
		button.submit();
		button.click();
		button.setText("This is the Button Class");

	}

}
