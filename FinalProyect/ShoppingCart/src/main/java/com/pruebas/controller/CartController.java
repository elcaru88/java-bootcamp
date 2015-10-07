package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dto.ItemDTO;
import com.pruebas.model.Cart;
import com.pruebas.model.Item;
import com.pruebas.model.Product;
import com.pruebas.service.CartService;
import com.pruebas.service.ItemService;
import com.pruebas.service.ProductService;

@RestController
@RequestMapping(value="/cart")
public class CartController {
	
	CartService cartService;
	ItemService itemService;
	ProductService productService;
	
	@Autowired
	public CartController(CartService cartService, ItemService itemService, ProductService productService) {
		this.cartService = cartService;
		this.itemService = itemService;
		this.productService = productService;
		
	}
	
	// method to search a Cart by Id
	@RequestMapping(value="/list/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable int id) {
		Cart cart = this.cartService.getEntity(id);
		return new ResponseEntity<Cart>( cart, HttpStatus.OK);
	}

	// method to create a Cart
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody Cart cart) {
       this.cartService.addEntity(cart);
       return new ResponseEntity<Cart>( cart, HttpStatus.OK);
	 }
	
	// method to add a Item
	@RequestMapping(value="/buy" , method = RequestMethod.POST)
	public String addItem(
		@RequestParam(value="idproduct", required = true) int idproduct,	 
		@RequestParam(value="quantity", required = true) int quantity,
		@RequestParam(value="idcart", required = true) int idcart){
		Cart cart = cartService.getEntity(idcart);
		Product product = productService.getEntity(idproduct);
		Item item = new Item(quantity, cart , product);
		itemService.addEntity(item);
		return null;		
	}
	
	// method to add a Item2
	@RequestMapping(value="/buy2" , method = RequestMethod.POST)
	public ResponseEntity<?> addItem2(@RequestBody ItemDTO itemDTO) {
		Cart cart = cartService.getEntity(itemDTO.getIdcart());
		Product product = productService.getEntity(itemDTO.getIdproduct());
		Item item = new Item(itemDTO.getQuantity(), cart , product);
		itemService.addEntity(item);
		return new ResponseEntity<String>("Product: "+ product.getName()+" Quantity: "
		+ itemDTO.getQuantity()+" added to CART" , HttpStatus.OK);
	}
	
	// method to create a Item
	@RequestMapping(value = "item/create", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody Item item) {
	    this.itemService.addEntity(item);
		return new ResponseEntity<Item>( item, HttpStatus.OK);
	}
}
