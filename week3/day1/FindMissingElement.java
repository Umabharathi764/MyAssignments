package week3.day1;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] num = {1,4,3,2,8,6,7};
		int highestNumber=num[0];
		for (int i=1; i<num.length; i++)
		{
			if(num[i] > highestNumber)
			{
				highestNumber=num[i];
			}
			
		}
		System.out.println("Highest Number in an array:" +highestNumber);		
		int originalSum =0;
		for (int i=0; i<num.length; i++)
		{
			originalSum = originalSum+num[i];
		}
		System.out.println("Sum of elements in array:" +originalSum);
		int expectedSum =0;
		for (int i=0; i<=highestNumber; i++)
		{
			expectedSum = expectedSum+i;
		}
		System.out.println("Sum of range of elements in an array:" +expectedSum);
		System.out.println("Missing Element is:" + "" + (expectedSum-originalSum));

	}

}
