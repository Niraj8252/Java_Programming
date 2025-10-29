package Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNumbersUsingListInbuiltMethod {
	public static void main(String[] args) {
		// Ascending order
		List<Integer> numbers = Arrays.asList(4,6,2,9,5,2,7,3);
		Collections.sort(numbers);
		System.out.println("Ascending order : "+numbers);

		// Descending order
		List<Integer> number = Arrays.asList(4,6,2,9,5,2,7,3);
		number.sort(Collections.reverseOrder());
		System.out.println("Descending order : "+number);
	}

}
