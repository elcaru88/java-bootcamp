package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.ProductDAO;
import com.pruebas.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO productDAO;
	
	public boolean addEntity(Product Product) {
		return productDAO.addEntity(Product);
	}
	
	public Product getEntity(int id) {
		System.out.println("Service Get Entity Method");
		return productDAO.getEntity(id);
	}
	
	public List<Product> getEntities() {
		List<Product> result = new ArrayList<Product>();
		for (Product t : productDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}
	
	public boolean updateEntity(Product Product) {
		return productDAO.updateEntity(Product);
	}

}
