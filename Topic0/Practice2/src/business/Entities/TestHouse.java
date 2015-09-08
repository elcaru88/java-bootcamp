package business.Entities;

public class TestHouse {
	
	public static void main(String[] args) {
		
		Room room = new Room( 1 , "green");
		Kitchen kitchen = new Kitchen("amplia", 10.0 , true);
		House house = new House( "Cordoba 1323 " , 5 , 54.0 , room , kitchen , false , false);
		System.out.println(house.adress + " "+ house.kitchen.area);
	}
}
