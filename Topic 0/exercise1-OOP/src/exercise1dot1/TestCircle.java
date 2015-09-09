package exercise1dot1;

public class TestCircle {
	public static void main(String[] args) {
		
	
	Circle c1 = new Circle();
//	System.out.println(c1.getRadius());

	System.out.println("Circle radius = "+ c1.getRadius()+", area = "+c1.getArea());
	
	// 2
	System.out.println(c1.getColor());
	
	// 3
	// i can't access because the variable is private
	// but i can make a method to do that
	// like setRadius
	
	// 4
	
	c1.setColor("blue");
	c1.setRadius(2.0);
	
	System.out.println("Circle new color = "+c1.getColor()+" , new radius = "+c1.getRadius());
	
	//6
	System.out.println(c1.toString());
	System.out.println(c1); //implicit
	
	
	
	
	}

}
