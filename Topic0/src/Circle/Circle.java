package Circle;

public class Circle {          
	
   private double radius;
   private String color;
   
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   
   public Circle(double r) {
      this.radius = r;
      this.color = "red";
   }
   
   public double getRadius() {
     return this.radius; 
   }
   
   public String getColor() {
	return this.color;
   }

   public void setColor(String color) {
	this.color = color;
   }
 
   public void setRadius(double radius) {
	this.radius = radius;
   }

   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   public Circle (double r, String c) {
	   this.radius = r;
	   this.color = c;
   }
   
   public String toString() {
	   return "Circle: radius=" + radius + " color=" + color;
	}
}