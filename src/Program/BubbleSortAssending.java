package Program;

public class BubbleSortAssending {
	public static void main(String[] args) {
		int x[]= {12,4,5,6,13,16,54,34};
		
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]>x[j]) {
				int temp= x[i];
				x[i]=x[j];
				x[j]= temp;
			}
			}
			System.out.print(x[i] +" ");
		}
		System.out.println("Lowest no is : " + x[0] +" ");
		System.out.println("Highest no is : " + x[x.length-1] +" ");
	}

}
