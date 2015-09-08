package Book;


public class TestAuthor {
	
	public static void main(String[] args) {
		
	

	Author anAuthor = new Author("Jorge Luis Borges", "Jorge@somewhere.com", 'm');
	System.out.println(anAuthor);   
	anAuthor.setEmail("LuisBorges@nowhere.com");
	System.out.println(anAuthor);
	}

}
