package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.CategoryDAO;
import com.pruebas.model.Category;

@Service
public class CategoryServiceImp {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	public boolean addEntity(Category category) {
		categoryDAO.addEntity(category);
		return true;
	}

	public Category getEntity(int id) {
		Category result = categoryDAO.getEntity(id);
		return result;
	}

	public List<Category> getEntities() {
		List<Category> result = new ArrayList<Category>();
		for (Category category : categoryDAO.getEntities()) {      //
			result.add(category);
		}
		return result;
	}

	public boolean updateEntity(Category Category) {
		categoryDAO.updateEntity(Category);
		return true;
	}

}
