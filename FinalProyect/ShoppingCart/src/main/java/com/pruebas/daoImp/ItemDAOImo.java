package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.ItemDAO;
import com.pruebas.model.Item;

@Repository
public class ItemDAOImo implements ItemDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Item item) {
		this.sessionFactory.getCurrentSession().save(item);
		return true;
	}

	@Transactional
	public Item getEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Item> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateEntity(Item item) {
		sessionFactory.getCurrentSession().update(item);
		return false;
	}

}
