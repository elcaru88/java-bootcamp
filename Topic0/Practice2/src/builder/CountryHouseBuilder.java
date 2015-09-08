package builder;

import entidades.House;

public class CountryHouseBuilder implements HouseBuilder{
	
	private House house;
	
	public CountryHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildColor() {
		house.setColor("Green");		
	}

	@Override
	public void buildValue() {
		house.setPrice(156777);
	}

	@Override
	public House getHouse() {
		return house;
	}


	@Override
	public void buildAdress() {
		house.setAdress(" Ruta 12 km1234" );		
	}
	

}
