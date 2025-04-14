package week3.day2;

public class CheckBoxButton extends Button
    {
	public void clickCheckButton() 
	{
		System.out.println("This method is to click Checkbox button");
	}

	public static void main(String[] args) 
	{
		CheckBoxButton checkboxbutton = new CheckBoxButton();
		checkboxbutton.clickCheckButton();
		checkboxbutton.submit();
		checkboxbutton.click();
		checkboxbutton.setText("This is the Checkboxbutton Class");

	}

}
