package Program;

public class ReverseOnlyStringFromCombinationString {
	public static void main(String[] args) {
		
//		// 1st Method (Reverse and print only string)
//		String str ="N23@i4%r7^a*#j56";
//		String s =" ";
//		  
//		for(int i=0; i<str.length();i++) {
//			char c = str.charAt(i);
//			if(c>='a' && c<='z' || 'A'<=c && 'Z'>=c) {
//				s=c+s;
//			}
//		}
//		System.out.println(s);
//
//    }
//}
		
		// 2nd Method (Reverse string and other character keep as it is)
		  String input = "N@1i3r@a7j";
	        String result = reverseCharactersOnly(input);
	        System.out.println("Original String: " + input);
	        System.out.println("Reversed String: " + result);
	    }

	    public static String reverseCharactersOnly(String str) {
	        char[] chars = str.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;

	        while (left < right) {
	            if (!Character.isLetter(chars[left])) {
	                left++; // Move left pointer if it's not a letter
	            } else if (!Character.isLetter(chars[right])) {
	                right--; // Move right pointer if it's not a letter
	            } else {
	                // Swap the characters at left and right pointers
	                char temp = chars[left];
	                chars[left] = chars[right];
	                chars[right] = temp;
	                left++;
	                right--;
	            }
	        }

	        return new String(chars);
	}
}
