package PP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Apple", "Banana", "Orange", "Grapes");
		
		// Ascending order
		Collections.sort(list);
		System.out.println("Ascending order : "+list);
		
		// Descending Order
		list.sort(Collections.reverseOrder());
		System.out.println("Decending order : " + list);
		
	}

}
