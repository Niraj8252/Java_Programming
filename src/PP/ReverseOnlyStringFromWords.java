package PP;

public class ReverseOnlyStringFromWords {
	public static void main(String[] args) {
		String s = "Niraj Kumar";
		String str[] = s.split(" ");
		
		for(String st : str){
			String reverse = "";
//			for(int j= st.length()-1; j>=0; j--) {
//				reverse = reverse + st.charAt(j);
//			}
//			System.out.print(reverse + " ");
			for(int j=0 ; j<=st.length()-1; j++) {
				reverse =  st.charAt(j)+reverse;
			}
			System.out.print(reverse + " ");
		}	
		
//		for(String st : str) {
//			System.out.print(new StringBuilder(st).reverse() + " ");
//		}
	}
}



