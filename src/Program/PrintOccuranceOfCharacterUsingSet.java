package Program;

import java.util.HashSet;
import java.util.Set;

public class PrintOccuranceOfCharacterUsingSet {
	public static void main(String[] args) {
		String str = "Pentamount";
		
		Set<Character> set = new HashSet<Character>();
	 for (int i = 0; i < str.length(); i++) {
		set.add(str.charAt(i));
	}
	 for (Character character : set) {
		 int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(character==ch) {
				count++;
			}
		}
		System.out.println(character +" : Occurance of character is :" +count);
	}
	}
}
