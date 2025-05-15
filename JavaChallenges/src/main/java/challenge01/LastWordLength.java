package challenge01;

import java.util.Scanner;

public class LastWordLength {
	
	public static int lengthOfLastWord(String str)
	{
		if (str==null || str.trim().isEmpty())
		{
			return 0;
		}
		String[] words=str.trim().split(" ");
		int i=words.length-1;
		return words[i].length();
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input=scanner.nextLine();
		System.out.println("The Length of the last word is: "+ lengthOfLastWord(input));

	}
	


}
