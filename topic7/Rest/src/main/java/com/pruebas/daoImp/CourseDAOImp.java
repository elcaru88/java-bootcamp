package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CourseDAO;
import com.pruebas.model.Course;

@Repository
public class CourseDAOImp implements CourseDAO {
	
    @Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(Course course) {
		System.out.println("DAO addEntityMethod");
	    this.sessionFactory.getCurrentSession().save(course);
	    return true;
	}

//	@Transactional
//	public Course getEntity(int id) {
//		System.out.println("DAO getEntityMethod");
//		return (Course) sessionFactory.getCurrentSession().get(Course.class, id);
//	}
	
	@Transactional
	public Course getEntity(int id) {
		System.out.println("DAO getEntityMethod");
		return (Course) sessionFactory.getCurrentSession().get(Course.class, id);
	}
    
	@Transactional
	public List<Course> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateEntity(Course course) {
		sessionFactory.getCurrentSession().update(course);
		return true; 
		// hacer la validation
	}

}
