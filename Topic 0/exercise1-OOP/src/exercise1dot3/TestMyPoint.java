package exercise1dot3;

public class TestMyPoint {
	public static void main(String[] args) {
		
	
	MyPoint p1 = new MyPoint(1,1);
	
	//System.out.println(p1.distance(5, 0));
	MyPoint p2 = new MyPoint(2,2);
	
	
	MyPoint p3 = new MyPoint(3,3);
	System.out.println(p2.equals(p3));
	
	System.out.println(p1.distance(p2));
	System.out.println(p2.distance(p3));
	System.out.println(p3.distance(p1));
}
}