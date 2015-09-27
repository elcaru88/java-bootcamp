import static org.junit.Assert.*;

import org.junit.Test;

public class ShopTest {

	
	@Test
	public void testName() {
		//fail("Not yet implemented");
		ShopCart sc = new ShopCart();
		Item item = new Item("lala", 1.00, 2);
		sc.addProduct("lala", 1.00, 2);
		//sc.addProduct("ag", 2.00, 2);
		assertEquals(item.getName(), sc.getItem().getName());
		//assertEquals(expected, actual);
	}
	
	@Test
	public void testQuantiti() throws Exception {
		ShopCart sc = new ShopCart();
		Item item = new Item("cd", 1.00, 5);
		sc.addProduct("cd", 1.00, 5);
		assertEquals(item.getQuantity(), sc.getItem().getQuantity());
	}
	
	@Test
	public void testPrice() throws Exception {
		ShopCart sc = new ShopCart();
		Item item = new Item("cdw", 1.50, 1);
		sc.addProduct("cdw", 1.50, 1);
		assertEquals(item.getPrice(), sc.getItem().getPrice());
	}

	

}
