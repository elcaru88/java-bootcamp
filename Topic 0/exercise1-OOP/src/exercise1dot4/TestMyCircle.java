package exercise1dot4;

import exercise1dot3.MyPoint;

public class TestMyCircle {
	public static void main(String[] args) {
		
	
	MyCircle mc1 = new MyCircle(5, 6, 2);
	MyPoint p1 = new MyPoint(5,1);
	MyPoint p2 = new MyPoint(5,2);
	MyCircle mc2 = new MyCircle(p1,3);

	mc1.setRadius(3);
	System.out.println(mc1.getRadius());
	
	mc2.setCenter(p2);
	System.out.println(mc2.getCenter());
	System.out.println(mc2.getCenterX());
	System.out.println(mc2.getCenterY());
	
	mc2.setCenterXY(8,5);
	System.out.println(mc2);
	System.out.println(mc1.getArea());
	
	
	
	
	
	
	
	}
}
