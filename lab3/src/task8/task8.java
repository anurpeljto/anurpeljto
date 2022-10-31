package task8;

import java.util.Scanner;

public class task8 {
	public static void main (String[] args) {
		/* Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward). 
		 * Program output: */
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a text: ");
		String userInput = reader.nextLine();
		palindrome(userInput);
	}
	
	public static void palindrome(String word) {
		String nStr = "";
		char temp;
		for(int i=word.length(); i>0; i--) {
			temp = word.charAt(i-1);
			nStr += temp;
		}
		if (nStr.equals(word)) {	// could also have used if(nStr.compareTo(word) == 0)
			System.out.println("The word is a palindrome!");
		}
		else {
			System.out.println("The word is not a palindrome!");
		}
	}

}
