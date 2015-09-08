package keyPoint2;

public class OneRoomHouse implements HouseBuilder{

	private House house;
	
	public OneRoomHouse(){
		house = new House();
	}
	
	public void buildRoom() {
	house.setRooms(1);
			}

	
	public void buildBathroom() {
	house.setBathroom(1);
		
	}

	
	public void buildLivingroom() {
	house.setLivingroom('y');
		
	}

	@Override
	public House getHouse() {

		return house;
	}
	
	

}
