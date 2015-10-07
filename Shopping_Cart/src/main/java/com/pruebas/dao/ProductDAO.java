package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Product;

public interface ProductDAO {
	
	public boolean addEntity(Product entity);
	public Product getEntity (int id);
	public List<Product> getEntities ();
	public boolean updateEntity (Product entity);

}
