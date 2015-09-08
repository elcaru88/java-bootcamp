
public class HousePartBuilder implements PartBuilder{
	
	private Part part;
	
	

	public HousePartBuilder() {
		part = new Part();
	}

	@Override
	public void buildFloor() {
		// TODO Auto-generated method stub
		part.setFloor("tile floor");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		part.setWall("brick wall");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		part.setRoof("tile roof");
	}

	@Override
	public void buildDoor() {
		// TODO Auto-generated method stub
		part.setDoor("wood door");
	}

	@Override
	public void buildWindow() {
		// TODO Auto-generated method stub
		part.setWindow("metal window");
		
	}

	@Override
	public Part getPart() {
		// TODO Auto-generated method stub
		return part;
	}
	

}
