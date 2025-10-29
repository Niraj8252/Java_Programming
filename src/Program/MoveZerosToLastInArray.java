package Program;

public class MoveZerosToLastInArray {
	public static void moveZeroToEnd(int []arr) {
		int index =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
			arr[index] = arr[i];
			index++;

			}
		}
		while(index<arr.length) {
			arr[index] = 0;
			index++;
		}
		
	}
	public static void main(String[] args) {
		int [] arr = {0,3,5,0,7,12,0,67};
		moveZeroToEnd(arr);
		
		for(int num : arr) {
			System.out.print( num + " ");
		}
	}

}
