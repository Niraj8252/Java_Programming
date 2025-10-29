package Program;

public class BubbleSortDesending {
	public static void main(String[] args) {
		int a[]= {34,76,6,3,45,98,7,9};
		
		for(int i = 0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i] + " , ");
		}
	}


}
