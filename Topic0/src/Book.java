
public class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book (String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book (String name, Author author, double price, 
	     int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
//	toString() that returns "'book-name' by author-name (gender) at email".
//	(Take note that the Author's toString() method returns "author-name (gender) at email".)
	
	public String toString(){
		return this.name +"by :"+ author.toString() ;
	}
	
//	TRY:
//
//	    Printing the name and email of the author from a Book instance. (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).
//	    Introduce new methods called getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book class to return the name, email and gender of the author of the book. For example,
//
	public String getAuthorName() {
		return this.author.getName();
	}
	
	public String getAuthorEmail(){
		return this.author.getEmail();
	}
	
	public char getAuthorGender(){
		return this.author.getGender();
	}
	
	

}
