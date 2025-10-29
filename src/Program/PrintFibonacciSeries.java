package Program;

public class PrintFibonacciSeries {
	public static void main(String[] args) {
		int x =0;
		int y =1;
		
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<=10;i++) {
			 int z = x+y;
			 System.out.println(z);
			 x=y;
			 y=z;
		}
	}

}
