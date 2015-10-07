package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.UserDAO;
import com.pruebas.model.User;

@Repository
public class UserDAOImp implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Transactional
	public boolean addEntity(User user) {
		System.out.println("DAO addEntity Method");
		this.sessionFactory.getCurrentSession().save(user);
		return true;
	}
    
	@Transactional
	public User getEntity(int id) {
		System.out.println("DAO getEntity Method");
		return (User) sessionFactory.getCurrentSession().get(User.class, id) ;
	}

	@Transactional
	public List<User> getEntities() {
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return users;
	}
    
	@Transactional
	public boolean updateEntity(User user) {
		sessionFactory.getCurrentSession().update(user);
		return true; 
	}
}
