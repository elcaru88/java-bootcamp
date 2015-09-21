package Circle;
import Point.MyPoint;


public class MyCircle {
	
	MyPoint center;
	int radius ;
	
	public MyCircle( int x, int y , int radius){
		this.center.setX(x);
		this.center.setY(y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint p , int radius){
		this.center = p;
		this.radius = radius;
	}
	
	public String toString(){
		return "Circle @ "+ this.center.toString()+ "radius=" +this.radius;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	

}
