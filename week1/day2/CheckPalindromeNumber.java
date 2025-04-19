package week1.day2;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int i=121;         
		int input =i;       
        int output = 0;     
        
         for (; i != 0; i /= 10) 
         {   
            int rem = i % 10;        
            output = output * 10 + rem;     

	}
         
         if (input == output) 
         {
             System.out.println(input + " is a palindrome.");
         } 
         else 
         {
             System.out.println(input + " is not a palindrome.");
         }
}
}
