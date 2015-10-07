package com.pruebas.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CourseDAO;
import com.pruebas.model.Course;


@Repository
public class CourseDAOImp implements  CourseDAO{//implements services de GenericDAO<Course>
	
	@Autowired
	private SessionFactory sessionFactory;
		
//	@Autowired
//	public CourseDAOImp(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
	

	@Transactional
	public boolean addEntity(Course course) {
		sessionFactory.getCurrentSession().save(course);
		return true;
	}

	@Transactional
	public Course getEntity(int id) {
		return (Course) sessionFactory.getCurrentSession().get(Course.class, id);
	}
	@Transactional
	public List<Course> getEntities() {
		@SuppressWarnings("unchecked")
		List<Course> courses = (List<Course>) sessionFactory.getCurrentSession()
				.createCriteria(Course.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return courses;
	}

	@Transactional
	public boolean updateEntity(Course course) {
		sessionFactory.getCurrentSession().update(course);
		return true; 
		
	}

}
