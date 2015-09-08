package keyPoint2;

public class Test {
	
	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new OneRoomHouse();
		
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.costructHouse();
		House house = houseDirector.getHouse();
		System.out.println(house);
		
		
		
		
	}

}
