package exercise1dot4;

import exercise1dot3.MyPoint;

public class MyCircle {

	private MyPoint center;
	private int radius;

	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getCenterX() {
		return center.getX();
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterXY(int x, int y){
		center.setXY(x, y);
	}

	public String toString() {
		return "Circle @ (" + center.getX() + ", " +center.getY()+") radius = "+ radius ;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}

	
	
	
	
	
	
	
}
