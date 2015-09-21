package Circle;

public class CircleTest {      
   public static void main(String[] args) {
     
      Circle c1 = new Circle();
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      Circle c2 = new Circle(2.0 , "Verde");
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
      //3  public vs. private: In TestCircle, can you access the instance variable radius directly
      //(e.g., System.out.println(c1.radius)); or assign a new value to radius (e.g., c1.radius=5.0)? 
      //Try it out and explain the error messages. 
      // El Error esta en que las variables son privadas.
      
      
      
      Circle c3 = new Circle();   // construct an instance of Circle
      c3.setRadius(5.0);          // change radius
      c3.setColor("Blue");           // change color
   
   Circle c4 = new Circle(5.0 , "Red");
   System.out.println(c4.toString());
   
   Circle c6 = new Circle(1.2);
   System.out.println(c6.toString());  // explicit call
   System.out.println(c6);             // println() calls toString() implicitly, same as above
   System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
   }
}