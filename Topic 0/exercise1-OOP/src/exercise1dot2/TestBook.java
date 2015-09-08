package exercise1dot2;

public class TestBook {
	public static void main(String[] args) {
		
		Author a1 = new Author("Author name", "email", 'M');
		
		Book b1 = new Book("Book name", a1, 5.5);
		
		System.out.println(b1);
		
		System.out.println(b1.getAuthor().getName());
		System.out.println(b1.getAuthor().getEmail());
		
		System.out.println(b1.getAuthorName());
		System.out.println(b1.getAuthorEmail());
		System.out.println(b1.getAuthorGender());
	}

}
