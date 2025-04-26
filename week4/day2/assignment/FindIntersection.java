package week4.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare two arrays
		List<Integer> num1 = new ArrayList<>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> num2 = new ArrayList<>(Arrays.asList(1,2,8,4,9,7));
		//Sort both the arrays
		Collections.sort(num1);
		Collections.sort(num2);
		System.out.println("Common elements are:");
		//iterate through num1
		 for (int i = 0; i < num1.size(); i++) 
		 {
			 Integer value = num1.get(i);
		//Check if num2 contains the current value
		if(num2.contains(value))
		{
			System.out.println(value);
		}
		 }
		

	}

}
