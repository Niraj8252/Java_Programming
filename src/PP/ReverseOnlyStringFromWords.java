package PP;

public class ReverseOnlyStringFromWords {
	public static void main(String[] args) {
		String s = "Niraj Kumar";
		String str[] = s.split(" ");
		
//		for(int i = 0; i<str.length; i++) {
//			String st = str[i];
//			String reverse = "";
//			for(int j= st.length()-1; j>=0; j--) {
//				reverse = reverse + st.charAt(j);
//			}
//			System.out.print(reverse + " ");
//		}	
		
		for(String st : str) {
			System.out.print(new StringBuilder(st).reverse() + " ");
		}
	}
}



