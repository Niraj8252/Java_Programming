package Program;

import java.util.HashMap;
import java.util.Map;

public class PrintOccuranceOfCharacterUsingMap {
	public static void main(String[] args) {
		String str = "Jharkhannnddd";
		char s[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: s) {
			//		for(int i=0; i<s.length; i++) {
			//			char ch = s[i];
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}else {
				map.put(ch, 1);
			}
		}System.out.println(map);
	}

}
