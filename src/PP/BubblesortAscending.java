package PP;

public class BubblesortAscending {
	
	public static void main(String[] args) {
		
		int x[] = {1,5,67,87,34,65,98,34,25,76,98};
		
		for(int i = 0; i<x.length; i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[i]>x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j]= temp;
				}
			}
			System.out.print(" "+ x[i]);
		}
	}

}
