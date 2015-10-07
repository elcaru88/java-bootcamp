package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CategoryDAO;
import com.pruebas.model.Category;

@Repository
public class CategoryDAOImp implements CategoryDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Category product) {
		this.sessionFactory.getCurrentSession().save(product);
		return false;
	}

	@Transactional
	public Category getEntity(int id) {
		System.out.println("categoryDAO getEntity Method");
		Session session = this.sessionFactory.getCurrentSession();
		Category category = (Category) session.get(Category.class, id);
		return category;
	}

	@Transactional
	public List<Category> getEntities() {
		@SuppressWarnings("unchecked")
		List<Category> categorys = (List<Category>) sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return categorys;
	}

	@Transactional
	public boolean updateEntity(Category entity) {
		sessionFactory.getCurrentSession().update(entity);
		return false;
	}

}
