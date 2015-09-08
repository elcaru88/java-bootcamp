package builder;

import entidades.House;

public class HouseDirector {
	
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;	
	}
	
	public void constructHouse(){
		houseBuilder.buildAdress();
		houseBuilder.buildColor();
		houseBuilder.buildValue();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}
	


}
