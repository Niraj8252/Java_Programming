package PP;

public class OccuranceOfStringWithoutCollection {
	public static void main(String[] args) {
		String name = "niraj kumar";
		name = name.replace(" ", "");
		int arr[] = new int[256];
		
		// Count occurrences
		for(int i =0; i<name.length(); i++) {
			arr[name.charAt(i)]++;
		}
		
		// Print Occurrences
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>0) {
				System.out.println((char)i + " => " + arr[i]);
			}
		}
	}

}
