package Triangle;

import Point.MyPoint;

public class TestMyTriangle {
	
	public static void main(String[] args) {
		
		MyPoint v1 = new MyPoint( 1 , 1);
		MyPoint v2 = new MyPoint( 1 , 2);
		MyPoint v3 = new MyPoint( 45 , 1);
		
		
		MyTriangle t1 = new MyTriangle(v1 ,v2,v3);
		
		System.out.println(t1.getPerimeter());
		System.out.println(t1.printType());
		
		
	}
	
	
	
	

}
