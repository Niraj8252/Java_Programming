package PP;

import java.util.HashSet;
import java.util.Set;

public class PrintFirstRepeatedCharacter {
	public static void main(String[] args) {
		String s = "bangalbnore";

		Set<Character> set = new HashSet<>();


		for(char c : s.toCharArray()) {
			if(set.contains(c)) {
				System.out.println("First repeated character is : " + c);
				break;
			}else {
				set.add(c);
			}
		}

		// Using for loop
		//		for(int i=0; i<s.length(); i++) {
		//			char ch = s.charAt(i);
		//			if(set.contains(ch)) {
		//				System.out.println("First repeated character is : " + ch);
		//			}else {
		//				set.add(ch);
		//			}
		//		}
	}

}
