package PP;

public class BubblesortDecending {
	
	public static void main(String[] args) {
		
		int x [] = {11,45,67,89,32,58,94,51};
		
		for(int i = 0; i<x.length; i++) {
			for(int j =i+1; j<x.length; j++) {
				if(x[i]<x[j]) {
					int temp = x[i];
					x[i]=x[j];
					x[j]= temp;
				}
			}
			System.out.print(" " + x[i]);
		}
	}

}
