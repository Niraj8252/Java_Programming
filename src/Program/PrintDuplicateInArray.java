package Program;

import java.util.LinkedHashSet;
import java.util.Set;




//import java.util.HashSet;
//
//public class PrintDuplicateInArray {
//    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 4, 5, 4, 6, 6, 6};
//
//        // Step 1: Store unique elements
//        HashSet<Integer> unique = new HashSet<>();
//        for (int num : arr) {
//            unique.add(num);
//        }
//
//        // Step 2: For each unique element, count and print frequency
//        for (int num : unique) {
//            int count = 0;
//            for (int value : arr) {
//                if (value == num) {
//                    count++;
//                }
//            }
//            System.out.println(num + " occurs " + count + " times");
//        }
//    }
//}


// 2nd method
public class PrintDuplicateInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7};
        Set<Integer> set = new LinkedHashSet<Integer>();

        // Step 1: Add all unique elements to set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Step 2: For each unique element, count its occurrences in the array
        for (int x : set) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    count++;
                }
            }
            if(count>1) {
            System.out.println(x + " occurs: " + count + " time(s)");
            }
        }
    }
}

