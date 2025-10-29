package Program;

public class ReverseStringUsingRecursion {

	public static void main(String []args) {
		String str = "jamshedpur";
		
				System.out.println(str.substring(0, str.length()-1));
				recursiveReverseString(str);
	}
		public static void recursiveReverseString(String str) {
			if (str.isEmpty()) {
				return;
			}
			System.out.print(str.charAt(str.length()-1));
			recursiveReverseString(str.substring(0, str.length()-1));
		}
}
