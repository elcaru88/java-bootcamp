package com.pruebas.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CategoryDAO;
import com.pruebas.model.Category;


@Repository
public class CategoryDAOImp implements CategoryDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Category entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return true;
	}

	@Transactional
	public Category getEntity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Category p = (Category) session.get(Category.class, new Integer(id));
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Category> getEntities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Category> personsList = session.createQuery("from Category").list();
		return personsList;
	}

	@Transactional
	public boolean updateEntity(Category entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
