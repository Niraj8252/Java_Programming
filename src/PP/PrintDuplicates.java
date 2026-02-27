package PP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,3,4,6,8,9,2,3,4,5,2,6,7,92,6,3,2};
		
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicate = new ArrayList<>();
	
		for(int num : arr) {
			if(set.contains(num)) {
				duplicate.add(num);
			}else {
				set.add(num);
			}
		}
		System.out.println(duplicate);
		System.out.println(set);
	}

}
