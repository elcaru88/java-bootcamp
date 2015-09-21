package builder;

import entidades.House;

public class ModernHouseBuilder implements HouseBuilder {

	
	private House house;
	
	public ModernHouseBuilder(){
		house = new House();
	}
	@Override
	public void buildAdress() {
		house.setAdress(" Rioja 123 ");
	}

	@Override
	public void buildColor() {
		house.setColor("blue");		
	}

	@Override
	public void buildValue() {
		house.setPrice(4458888);
		
	}

	@Override
	public House getHouse() {
		return house;
	}
	
	
	
	

}
