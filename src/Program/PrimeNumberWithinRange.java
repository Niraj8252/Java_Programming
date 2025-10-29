package Program;

public class PrimeNumberWithinRange {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,2,13,14,15,16,17,18,19};
		int count = 0;
		
		for(int i= 0; i<=arr.length-1; i++) {
			int n=arr[i];
		int j=2;
//		int n =7;
			while(n>=0) {
				if(n%j==0) {
					break;
				}
				else {
					j++;
				}
			}
			if(n==j) {
				count++;			
			System.out.println( " Number is prime : " + n);
		}	else {
			System.out.println("Number is not prime :" + n);
		}	
	}
		System.out.println("Total no of prime number :" +count);
}
}
