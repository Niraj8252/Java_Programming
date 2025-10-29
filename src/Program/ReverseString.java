package Program;

public class ReverseString {
	public static void main(String []args) {
		String str = "jamshedpur";
	
		  String rev = "";
		 
//		  for(int i =0; i<str.length();i++) {
////			  char c = str.charAt(i);
//			  rev = str.charAt(i)+rev;
//			  }
//		  System.out.println(rev);
		  for(int i =str.length()-1; i>=0; i--) {
			  System.out.print(str.charAt(i));
		  }
	}
}
