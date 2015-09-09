package keyPoint2;

public class House {

	//Design a building like a house and provide a
	//builder to build it.
	private int rooms,bathroom;
	private char livingroom;
	
	
	public int getRooms() {
		return rooms;
	}

	public int getBathroom() {
		return bathroom;
	}

	public char getLivingroom() {
		return livingroom;
	}
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	
	public void setLivingroom(char livingroom) {
		this.livingroom = livingroom;
	}

	
	public String toString() {
		return " rooms = " + rooms + " , bathroom = " + bathroom
				+ " , livingroom = " + livingroom ;
	}
	
	
}
