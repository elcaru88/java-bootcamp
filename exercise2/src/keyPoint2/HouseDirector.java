package keyPoint2;

public class HouseDirector {
	
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector (HouseBuilder houseBuilder ){
		this.houseBuilder = houseBuilder;
	}
	
	
	public void costructHouse(){
		houseBuilder.buildRoom();
		houseBuilder.buildBathroom();
		houseBuilder.buildLivingroom();
		
	}

	public House getHouse(){
		return houseBuilder.getHouse();
	}
}
