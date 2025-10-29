package Program;

public class ReverseStringWithoutNewCreateNewString {
	public static void main(String[] args) {
		
		String s = "Bangalore";
		char ch[] = s.toCharArray();
		
		for(int i=0; i<ch.length/2; i++) {
			char temp= ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		//System.out.println(String.valueOf(ch));
		System.out.println(ch);
	}

}
