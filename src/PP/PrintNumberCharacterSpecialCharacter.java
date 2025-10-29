package PP;

public class PrintNumberCharacterSpecialCharacter {
	public static void main(String[] args) {
		
		String s = "a1@g%6WE13*";
		String charactr = "";
		String special = "";
		String number = "";
		
		for(int i =0; i<s.length(); i++) {
			if('a'<=s.charAt(i) && 'z'>=s.charAt(i) || 'A'<=s.charAt(i) && 'Z'>=s.charAt(i)) {
				charactr = charactr+s.charAt(i);
			}else if ('0'<=s.charAt(i) && '9'>= s.charAt(i)) {
				number = number+s.charAt(i);
			}else {
				special = special+s.charAt(i);
			}
		}
		System.out.println(charactr);
		System.out.println(number);
		System.out.println(special);
	}

}
