package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.ProductDAO;
import com.pruebas.model.Product;

@Repository
public class ProductDAOImp implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 

	@Transactional
	public boolean addEntity(Product product) {
		this.sessionFactory.getCurrentSession().save(product);
		return true;
	}

	@Transactional
	public Product getEntity(int id) {
		System.out.println("productDAO getEntity Method");
		return (Product) this.sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Transactional
	public List<Product> getEntities() {
		@SuppressWarnings("unchecked")
		List<Product> products = (List<Product>) sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return products;
	}

	@Transactional
	public boolean updateEntity(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return false;
	}

}
