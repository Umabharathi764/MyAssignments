package week4.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingCollection {

	public static void main(String[] args) {
		//Declare an array
		List<Integer> num = new ArrayList<>(Arrays.asList(1,4,3,2,8,6,7));
		//sorting the elements in asc order
		Collections.sort(num);
		//Loop through the list
		for (int i = 0; i < num.size() - 1; i++) {
            int current = num.get(i);
            int next = num.get(i + 1);
            //check if there is any gap
            if(current+1 != next)
            {
            	for (int j = current + 1; j < next; j++) {
                    System.out.println("Missing number is: " + j);
            }
		}
		}
		

	}

}
