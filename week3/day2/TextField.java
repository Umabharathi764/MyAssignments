package week3.day2;

public class TextField extends WebElement
{
	public void getText()
	{
		System.out.println("This method is used to get the text");
	}
	public static void main(String[] args)
	{
		TextField textfield = new TextField();
		textfield.getText();
		textfield.click();
		textfield.setText("This is the TextField Class");

	}

}
