package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.ItemDAO;
import com.pruebas.model.Item;

@Service
public class ItemService {
	
	@Autowired
	ItemDAO itemDAO;
	
	public boolean addEntity(Item item) {
		return itemDAO.addEntity(item);
	}
	
	public Item getEntity(int id) {
		System.out.println("Service Get Entity Method");
		return itemDAO.getEntity(id);
	}
	
	public List<Item> getEntities() {
		List<Item> result = new ArrayList<Item>();
		for (Item t : itemDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}
	
	public boolean updateEntity(Item item) {
		return itemDAO.updateEntity(item);
	}

}
