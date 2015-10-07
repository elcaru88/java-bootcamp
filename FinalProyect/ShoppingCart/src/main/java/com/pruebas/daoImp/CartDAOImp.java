package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CartDAO;
import com.pruebas.model.Cart;

@Repository
public class CartDAOImp implements CartDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Cart cart) {
		this.sessionFactory.getCurrentSession().save(cart);
		return false;
	}

	@Transactional
	public Cart getEntity(int id) {
		System.out.println("cartDAO getEntity Method");
		return (Cart) this.sessionFactory.getCurrentSession().get(Cart.class, id);
	}

	@Transactional
	public List<Cart> getEntities() {
		@SuppressWarnings("unchecked")
		List<Cart> Cart = (List<Cart>) sessionFactory.getCurrentSession()
				.createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return Cart;
	}

	@Transactional
	public boolean updateEntity(Cart entity) {
		sessionFactory.getCurrentSession().update(entity);
		return false;
	}
}
