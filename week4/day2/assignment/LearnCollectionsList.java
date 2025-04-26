package week4.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsList {

	public static void main(String[] args) {
		//Declare a String Array
        List<String> organizations = new ArrayList<String>();
        //add method
        organizations.add("HCL");
        organizations.add("Wipro");
        organizations.add("Aspire Systems");
        organizations.add("CTS");
        //Print the list
        System.out.println("List after adding all Organizations is :" +organizations);
        //Arranging the collection in ascending order
        Collections.sort(organizations);
        System.out.println("List after sorting Organizations is :" +organizations);
        //Reverse the loop 
        Collections.reverse(organizations);
        System.out.println("List after Reversing the Organization list:" +organizations);

	}

}
