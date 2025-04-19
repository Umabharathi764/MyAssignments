package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 19;
		int count = 0;
		for (int i = 1; i <= num/2; i++)  
		{
			if (num % i == 0)
			{
				count++; 
							}
		}
		if (count>1)
		{
			System.out.println("The Number is not Prime");
		}
		else
		{
			System.out.println("The Number is Prime");
		}

	}

}
