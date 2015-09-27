package exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	Cash c = new Cash();
	CreditCard cc = new CreditCard();
	Paypal pp = new Paypal();
	DiscountFactory df = new DiscountFactory();
	Product Music_cd = new Product("Music_cd", 20.5);
	Product lamp = new Product("lamp",50);
	Product pc = new Product("pc", 2500.00);
	ShoppingCart shoppingCart = new ShoppingCart();
	
	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	@Test
	public void priceWithDiscountCashTest() {

		assertEquals(10.00, c.priceWithDiscount(100, 100), 0.0);
	}

	@Test
	public void priceWithDiscountCreditCardTest() {

		assertEquals(90.00, cc.priceWithDiscount(100, 0), 0.0);

	}

	@Test
	public void priceWithDiscountPaypalTest() {

		assertEquals(80.00, pp.priceWithDiscount(100.0, 20.0), 0.0);

	}

	@Test
	public void discountFactoryCashTest() {
		assertEquals(c.getClass(), df.getDiscount("cash").getClass());
		}
	
	@Test
	public void discountFactoryCreditCardTest() {
		assertEquals(cc.getClass(), df.getDiscount("Credit Card").getClass());
		}
	
	@Test
	public void discountFactoryPaypalTest() {
		assertEquals(pp.getClass(), df.getDiscount("Paypal").getClass());
		}
	
	@Test
	public void discountFactoryNullTest() {
		assertEquals(null, df.getDiscount("lalal"));
		}

	@Test
	public void getTotalPriceTest(){
	shoppingCart.add(pc);
	shoppingCart.add(lamp);
	shoppingCart.add(Music_cd);
	
	assertEquals(2570.5, shoppingCart.getTotalPrice(),0.0);
	
	}
	
	@Test
	public void getCheapestTest(){
	shoppingCart.add(pc);
	shoppingCart.add(lamp);
	shoppingCart.add(Music_cd);
	
	assertEquals(20.5, shoppingCart.getCheapest(),0.0);
	
	}
	
	@Test
	public void getExpensiveTest(){
	shoppingCart.add(pc);
	shoppingCart.add(lamp);
	shoppingCart.add(Music_cd);
	
	assertEquals(2500.0, shoppingCart.getExpensive(),0.0);
	
	}
	
	
	
}
