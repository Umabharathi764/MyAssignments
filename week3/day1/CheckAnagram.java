package week3.day1;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int lengthofText1 = text1.length();
		int lengthofText2 = text2.length();
		if(lengthofText1==lengthofText2)
		{
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(Arrays.equals(charArray1, charArray2));
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		

	}

}
