package Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Niraj", "Imran", "Dipanjay", "Sukhdeb", "Amit");
		Collections.sort(names);
		System.out.println("Ascending order : " +names);
		
		names.sort(Collections.reverseOrder());
		System.out.println("Descending order : "+names);
	}

}
