package TDD;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Cart;
import entities.Item;
import entities.Product;

public class CartTest {

	
	@Test
	public void addToCartTest () {
		
		Cart cart = new Cart();
		Item item = new Item(new Product(1, "ProductName", 100), 1);
		cart.addToCart(item) ;
		assertTrue( cart.getItems().contains(item));   
	}
	
	/* No es unitario porque tengo que usar el metodo addToCart() */
	
	@Test
	public void isOnCartTest() {
		
		Cart cart = new Cart();
		Product product =  new Product(1, "ProductName" , 100 );
		Item item = new Item( product , 1);
		cart.addToCart(item) ;
		assertEquals(  cart.isOnCart(product),item) ;
	}
	
	@Test
	public void getCheapestItemTest(){
		
		Cart cart = new Cart();
		Item item1 = new Item(new Product( 1, "ProductName", 10.0 ) , 1);
		cart.addToCart(item1);
		Item item2 = new Item(new Product( 1, "ProductName", 200.0 ) , 1);
		cart.addToCart(item2);
		assertEquals( cart.getCheapestItem(), item1);
		
	}
	
	@Test
	public void getExpItemTest(){ 
		
		Cart cart = new Cart();
		Item item1 = new Item(new Product(1,"ProductName",  100 ) , 1);
		cart.addToCart(item1);
		Item item2 = new Item(new Product(1,"ProductName", 1000.0 ) , 1);
		cart.addToCart(item2);
		assertEquals( cart.getExpItem(), item2);
	}
}
