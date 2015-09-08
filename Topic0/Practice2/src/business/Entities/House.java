package business.Entities;

public class House extends Building {
	
	Room room;
	Kitchen kitchen;
	boolean garage;
	boolean pool;
	
	public House( String adress , int floors , double mts2 , Room room, Kitchen kitchen , boolean garage , boolean pool){
		super(adress, floors, mts2);
		this.kitchen = kitchen;
		this.room = room;
		this.garage = garage;
		this.pool = pool;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}		

}
