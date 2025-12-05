package PP;

import java.util.HashSet;
import java.util.Set;

public class PrintLongestSubString {
	public static void main(String[] args) {
		String s = "jharkhand";

		int max =0;
		int left = 0;
		Set<Character> set = new HashSet<>();

		for(int right =0; right<s.length(); right++) {

			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			max =Math.max(max, right-left+1);
		}
		System.out.println(max);
	}
}
