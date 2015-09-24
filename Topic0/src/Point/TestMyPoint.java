package Point;

public class TestMyPoint {
	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint( 3, 4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(12, 123));
		
		MyPoint[] points = new MyPoint[11]; 
		for (int j = 0; j < points.length; j++) {
			points[j] = new MyPoint(j,j);    
		}
		
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}
}
