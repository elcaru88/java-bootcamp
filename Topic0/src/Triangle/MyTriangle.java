package Triangle;

import Point.MyPoint;

public class MyTriangle {
	
	MyPoint v1;
	MyPoint v2;
	MyPoint v3;
	
	public MyTriangle( int x1 , int y1 , int x2, int y2, int x3, int y3){
		this.v1.setX(x1);
		this.v2.setY(y1);
		this.v1.setX(x2);
		this.v2.setY(y2);
		this.v1.setX(x3);
		this.v2.setY(y3);
		
	}
	
	public MyTriangle( MyPoint v1 , MyPoint v2, MyPoint v3){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString(){
		return  "Triangle @ "+ v1.toString() +" "+ v2.toString() + " "+ v3.toString();
	}
	
	public double getPerimeter(){
		return  v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
	}
	
	public String printType() {
		if (v1.distance(v2) == v2.distance(v3) && v1.distance(v2) == v1.distance(v3) ) {
			return "Equilatero";
		}else if (v1.distance(v2) == v2.distance(v3) || v1.distance(v2) == v1.distance(v3) ||  v2.distance(v3) == v1.distance(v3)) {
			return "Isosceles";
		}else
		{ return "scalene";
		}
	}
	
	

}
