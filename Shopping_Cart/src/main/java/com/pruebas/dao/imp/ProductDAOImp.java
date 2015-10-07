package com.pruebas.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.ProductDAO;
import com.pruebas.model.Product;

@Repository
public class ProductDAOImp implements ProductDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Product entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return true;
	}

	@Transactional
	public Product getEntity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.get(Product.class, new Integer(id));
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Product> getEntities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> personsList = session.createQuery("from Product").list();
		return personsList;
	}

	@Transactional
	public boolean updateEntity(Product entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
