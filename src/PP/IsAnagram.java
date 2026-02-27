package PP;

import java.util.Arrays;

public class IsAnagram {
	public static boolean anagramCheck(String a, String b) {
		char [] s1 = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
		char [] s2 = b.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
		
		if(s1.length!=s2.length) {
			return false;
		}
//		char[]x = s1.toCharArray();
//		char[]x2 = s2.toCharArray();
		return Arrays.equals(s1, s2);
	}
	
	public static void main(String[] args) {
		System.out.println(anagramCheck("Niraj", "miraj"));
	}
	

}
