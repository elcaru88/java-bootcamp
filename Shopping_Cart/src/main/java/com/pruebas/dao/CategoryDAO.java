package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Category;

public interface CategoryDAO {
	
	public boolean addEntity(Category entity);
	public Category getEntity (int id);
	public List<Category> getEntities ();
	public boolean updateEntity (Category entity);

}
