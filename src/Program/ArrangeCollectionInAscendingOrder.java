package Program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrangeCollectionInAscendingOrder {
	public static void main(String[] args) {
		String s = "{USA, 1256},{India, 1250},{China,1500},{Brazil,540},{Russia, 1100}";
		String[] arr = s.substring(1, s.length()-1).split("},\\{");
		Map<String, Integer> map = new HashMap<String, Integer>();
		

		
		for (String element : arr) {
			String[] country = element.split(",");
			if (country.length > 1) {
				String s1 =country[1].trim();
				int i = Integer.parseInt(s1);
				map.put(country[0], i);
			}
		}

		map = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue, (oldVal, newVal) -> newVal, LinkedHashMap::new));
		
		System.out.println(map.toString());
	}

}
