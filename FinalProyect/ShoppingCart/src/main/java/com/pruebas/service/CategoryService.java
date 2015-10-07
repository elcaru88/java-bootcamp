package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.CategoryDAO;
import com.pruebas.model.Category;

@Service
public class CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	public boolean addEntity(Category category) {
		return categoryDAO.addEntity(category);
	}
	
	public Category getEntity(int id) {
		System.out.println("Service Get Entity Method");
		return categoryDAO.getEntity(id);
	}
	
	public List<Category> getEntities() {
		List<Category> result = new ArrayList<Category>();
		for (Category t : categoryDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}
	
	public boolean updateEntity(Category category) {
		return categoryDAO.updateEntity(category);
	}
	

}
