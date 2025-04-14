package week3.day1;

public class ReverseOddPositionWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		System.out.println("Words at Odd indexes:");
        for (int i = 0; i < words.length; i++) {
                 if (i % 2 != 0) {
                System.out.println(words[i]);
            }
                 
        }
        char[] charArray = test.toCharArray();
        System.out.println("\nCharacter Array:");
        for (int i = 0; i < charArray.length; i++) {
        	char c = charArray[i];
            System.out.print(c + " ");
        
	}
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { 
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        String result = String.join(" ", words);
        System.out.println("\nString with reversed words at Odd index: " + " " +result);
        }
	}



