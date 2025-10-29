package Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintArraySumOfPairs {
	public static void main(String[] args) {
		
		int arr []= {1,2,3,4,5,6,7,8,9,};
		int sum = 5;
		Map<Integer, Integer> map =new HashMap<>();
		Set<Set<Integer>> set = new HashSet<>();
		Set<int[][]> result = new HashSet<int[][]>();
		int[][] res;
		
				for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(sum==arr[i]+arr[j]) {
				//	map.put(arr[i], arr[j]);
					
					set.add(Set.of(arr[i], arr[j]));
					
					res = new int[1][2];
					res[0][0]=arr[i];
					res[0][1]=arr[j];
					result.add(res);
				}
			}
		}
//				map.entrySet().forEach(e -> System.out.print("["+e.getKey()+","+ e.getValue()+"]"));
//				System.out.println();
	System.out.println(set);
	System.out.println(Arrays.deepToString(result.toArray()));
	}

}
