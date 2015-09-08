
public class PartDirector {
	
	private PartBuilder buildingBuilder;

	public PartDirector(PartBuilder buildingBuilder) {
		super();
		this.buildingBuilder = buildingBuilder;
	}
	
	public void constructPart() {
		buildingBuilder.buildFloor();
		buildingBuilder.buildWall();
		buildingBuilder.buildRoof();
		buildingBuilder.buildDoor();
		buildingBuilder.buildWindow();
	}
	
	public Part getPart() {
		return buildingBuilder.getPart();
	}
	
	

}
