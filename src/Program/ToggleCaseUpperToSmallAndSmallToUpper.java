package Program;

public class ToggleCaseUpperToSmallAndSmallToUpper {
	public static void main(String[] args) {
		
		String str ="mAhAbhArAt";
		String result ="";
		
		for(int i = 0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				result = result + Character.toLowerCase(str.charAt(i));
			}else
				result = result + Character.toUpperCase(str.charAt(i));
		}
		System.out.println(result);
	}

}
