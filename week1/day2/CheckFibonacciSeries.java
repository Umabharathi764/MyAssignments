package week1.day2;

public class CheckFibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		for (int i=0; i<8; i++)
		{
			System.out.println(num1 + " "); 
			int num3 = num1 + num2; 
			num1 = num2; 
			num2 = num3; 
		}
		
	}

}
