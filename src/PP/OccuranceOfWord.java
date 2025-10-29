package PP;

import java.util.HashSet;
import java.util.Set;

public class OccuranceOfWord {
	public static void main(String[] args) {
		
		String s = "This is the reson this reson";
		String s1 []= s.toLowerCase().split(" ");
		
		Set<String> set = new HashSet<String>();
		
		for(String s2 : s1) {
			set.add(s2);
		}
		for(String s3 : set) {
			int count = 0;
			for(String s2:s1) {
				if(s3.equals(s2)) {
					count++;
				}
			}
			System.out.println(s3 + " : Occurance of word is : " + count);
		}
	}

}
