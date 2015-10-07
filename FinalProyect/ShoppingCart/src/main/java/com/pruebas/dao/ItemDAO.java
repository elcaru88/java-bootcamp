package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Item;


public interface ItemDAO {
	
	public boolean addEntity(Item Item );
	
	public Item getEntity(int id);
	
	public List<Item> getEntities();
    
	public boolean updateEntity(Item Item );

}
