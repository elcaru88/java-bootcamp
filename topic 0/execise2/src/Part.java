
public class Part {
	private String floor ;
	private String wall;
	private String roof;
	private String door;
	private String window;
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getWindow() {
		return window;
	}
	public void setWindow(String window) {
		this.window = window;
	}
	
	@Override
	public String toString() {
		return "Part [floor=" + floor + ", wall=" + wall + ", roof=" + roof + ", door=" + door + ", window=" + window
				+ "]";
	}
	
	

}
