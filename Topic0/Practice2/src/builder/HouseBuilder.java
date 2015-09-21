package builder;

import entidades.House;

public interface HouseBuilder {
	
	public void buildAdress();
	public void buildColor();
	public void buildValue();
	public House getHouse(); 
}
