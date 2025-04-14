package week3.day2;

public class RadioButton extends Button {
	public void selectRadioButton()
	{
		System.out.println("Selecting the Radio Button");
	}

	public static void main(String[] args) {
		
		RadioButton radiobutton = new RadioButton();
		radiobutton.selectRadioButton();
		radiobutton.submit();
		radiobutton.click();
		radiobutton.setText("This is the Radiobutton Class");		

	}

}
