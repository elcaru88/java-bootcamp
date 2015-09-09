package exercise1dot1;

public class Circle {
	
	private double radius;
	private String color;
	
	public Circle(){
	radius = 1.0;
	color = "red";
	}
	
	public Circle(double radius){
		this.radius = radius;
		color ="red";
	}
	
	// 1	
		public Circle(double radius, String color){
			radius = this.radius;
			color = this.color;
			
		}
	//	
		
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}

	
// 2	
	public String getColor(){
		return color;
	}
//
	
	// 4
	public void setRadius(double radius){
		this.radius = radius;
		
	}
	
	public void setColor (String color){
		this.color = color;
	}
	//
	
	// 6
	
	public String toString(){
		return "Circle : radius = "+radius+" , color = "+color;
	}
	
		
}
