package week3.day2;

public class WebElement {
	public void click()
	{
		System.out.println("This WebElement is Clickable");
	}
	public void setText(String text)
	{
		System.out.println("Set Text value is:" +text);
		
	}

	public static void main(String[] args) 
	{
		WebElement webElement = new WebElement();
		webElement.click();
		webElement.setText("This is the WebElement Class");
		
	}

}
