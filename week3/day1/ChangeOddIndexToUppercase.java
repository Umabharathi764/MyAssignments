package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
        System.out.println("Character Array:");
        for (int i = 0; i < charArray.length; i++) {
        	char c = charArray[i];
            System.out.print(c + " ");
	}
	
        System.out.println("\nCharacters at Odd indexes:");
        for (int i = 0; i < charArray.length; i++) {
                 if (i % 2 != 0) {
                System.out.println(charArray[i]);
            }
	}
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 != 0) { 
            	charArray[i]=Character.toUpperCase(charArray[i]);
            }
        }
        System.out.print("String after converting the odd index values to uppercase:" + " ");
        for (int i = 0; i < charArray.length; i++) {
        	char c = charArray[i]; {
            System.out.print(c);
	}

}
	}
}
