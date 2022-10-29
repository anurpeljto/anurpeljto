package task7;

import java.util.Scanner;
import java.util.ArrayList;

public class task7 {
	public static void main(String[] args) {
		/* Create the method lengths that gets a list of String variables as a parameter and 
		 * returns an ArrayList that contains the lengths of the Strings in the same order as 
		 * the original list.
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Moi");
		list.add("Benvenuto!");
		list.add("bader badger badger badger ");
		System.out.println("Total length: " + lengths(list));
		
	}
	
	public static ArrayList<Integer> lengths(ArrayList<String> strings) {
		int n;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (n=0; n<strings.size(); n++) {
			result.add((strings.get(n).length()));
		}
		return result;
		
	}

}
