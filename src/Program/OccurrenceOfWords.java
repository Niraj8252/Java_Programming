package Program;

import java.util.LinkedHashSet;

public class OccurrenceOfWords {

	public static void main(String[] args) {
		String s = "Good morning sir sir sir good to see you";
		String s1[] = s.toLowerCase().split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i =0; i<s1.length; i++) {
			set.add(s1[i]);
		}
		for(String word: set) {
			int count = 0;
			for(int i =0; i<s1.length; i++) {
				if(word.equals(s1[i])) {
					count++;
				}
			}
			System.out.println( " : Occurrence of word : " +word + " : " + count);
		}

	}

}
