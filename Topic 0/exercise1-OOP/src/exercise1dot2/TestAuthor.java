package exercise1dot2;

public class TestAuthor {
	public static void main(String[] args) {
		
	
	Author a1 = new Author("Fer", "mail", 'M');
	
	System.out.println(a1);
	
	a1.setEmail("email");
	System.out.println(a1);
}
}