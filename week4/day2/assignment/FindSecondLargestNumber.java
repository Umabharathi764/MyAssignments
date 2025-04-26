package week4.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		//Declare an array
				List<Integer> num = new ArrayList<>(Arrays.asList(3,2,11,4,6,7));
				//sorting the elements in asc order
				Collections.sort(num);
				System.out.println("Array after sorting :" +num);
				//get method to find second largest number
				int secondLargest = num.get(num.size()-2);
				System.out.println("The Second Largest Number is:" +secondLargest);
				

	}

}
