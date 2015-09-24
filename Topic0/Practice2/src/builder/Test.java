package builder;

import entidades.House;

public class Test {
	
	public static void main(String[] args) {
        
		
		//Country House
		HouseBuilder houseBuilder = new CountryHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println(house);
		
		//Modern House
		
		houseBuilder = new ModernHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house2 = houseDirector.getHouse();
		System.out.println(house2);
	}
}
