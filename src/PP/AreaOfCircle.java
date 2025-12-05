package PP;


public class AreaOfCircle {
public Number calculateAreaOfCiecle(int radius) {
		
		return (3.14*(radius*radius));
	
	}
	
	public static void main(String[] args) {
		int radius = 5;
		
		AreaOfCircle areaOfCircle = new AreaOfCircle();
		
		System.out.println(areaOfCircle.calculateAreaOfCiecle(radius));
		
	}

}
