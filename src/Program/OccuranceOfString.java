package Program;

import java.util.LinkedHashSet;

public class OccuranceOfString {
	public static void main(String[] args) {
		String s = "Jjjamshedpur";
	
	String str = s.toLowerCase();
//		
//		for(int i =0; i<s.length();i++) {
//			char ch = s.charAt(i);
//			int count =0;
//			for(int j=0;j<s.length();j++) {
//				char ch1 = s.charAt(i);
//				if(ch==ch1 && i>j) {
//					break;
//				}else {
//					count--;
//				}
//			
//			if(ch==ch1) {
//				count++;
//			}	
//			}
//			System.out.println(ch + " : occurance is : " + count );
//		}
//	}
//
//}

//public class OccurrenceOfString {
//    public static void main(String[] args) {
//        String str = "Jjjamshedpur";
//        String s = str.toLowerCase();
//        
//        // Create an array to store counts for each character
//        int[] charCount = new int[256]; // Assuming ASCII characters
//        
//        // Count occurrences of each character
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            charCount[ch]++;
//        }
//        
//        // Print the occurrences
//        for (int i = 0; i < charCount.length; i++) {
//            if (charCount[i] > 0) {
//                System.out.println((char) i + " : occurrence is : " + charCount[i]);
//            }
//        }
//    }
//}

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<str.length(); i++) {
			
			set.add(str.charAt(i));
		}
			for(char c : set) {
				int count = 0;
				for(int i = 0; i<str.length(); i++) {
					if(c==str.charAt(i)) {
						count++;
					}
				}
				System.out.println(c+ ": is : "+count);
		}
		
	}	

}
