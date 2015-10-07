package com.pruebas.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CartDAO;
import com.pruebas.model.Cart;

@Repository
public class CartDAOImp implements CartDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Cart entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return false;
	}

	@Transactional
	public Cart getEntity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Cart p = (Cart) session.get(Cart.class, new Integer(id));
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Cart> getEntities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Cart> cartList = session.createQuery("from Cart").list();
		return cartList;
	}

	
	@Transactional
	public boolean updateEntity(Cart entity) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
