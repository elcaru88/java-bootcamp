
public class Demo {
	public static void main(String[] args) {
		PartBuilder partBuilder = new HousePartBuilder();
		PartDirector partDirector = new PartDirector(partBuilder);
		partDirector.constructPart();
		Part part = partDirector.getPart();
		System.out.println("House is: "+ part);
	}

}
