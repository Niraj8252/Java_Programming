package Program;

public class PrintNumberCharacterSpecialCharacter {
	public static void main(String[] args) {
		String s ="1a@2b#3c$";
		String alpha =" ";
		String number = " ";
		String specialCharacter =" ";
		for(int i=0; i<s.length(); i++ ) {
			char ch = s.charAt(i);
			if('a'<=ch && 'z'>=ch || 'A'<=ch && 'Z'>=ch) {
				alpha = alpha +ch;
			}else if('0'<=ch && '9'>=ch){
				number = number +ch;
			}else {
				specialCharacter = specialCharacter+ch;
			}
		}
		System.out.println(alpha);
		System.out.println(number);
		System.out.println(specialCharacter);
	}

}
