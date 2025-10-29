package PP;

import java.util.HashSet;
import java.util.Set;

public class OccuranceOfString {
	public static void main(String[] args) {
		
		String str = "Bangngalllore";
		String str1 = str.toLowerCase();
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0; i<str.length(); i++) {
			set.add(str1.charAt(i));
		}
		for(char c :set) {
			int count = 0;
			for(int i =0; i<str1.length(); i++) {
				if(c==str1.charAt(i)) {
					count++;
				}
			}
			System.out.println(c+" : Occurance of string is : " + count);
		}
	}

}
