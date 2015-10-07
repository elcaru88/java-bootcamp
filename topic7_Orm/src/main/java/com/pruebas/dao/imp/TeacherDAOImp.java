package com.pruebas.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.TeacherDAO;
import com.pruebas.model.Teacher;

@Repository
public class TeacherDAOImp implements TeacherDAO{//implements GenericDAO<Teacher>
	
	@Autowired
	private SessionFactory sessionFactory;

	
//	@Autowired
//	public TeacherDAOImp(SessionFactory sessionFactory){
//		this.sessionFactory = sessionFactory;
//	}
	
	@Transactional
	public boolean addEntity(Teacher teacher) {
		sessionFactory.getCurrentSession().save(teacher);
		return true;
	}
	@Transactional
	public Teacher getEntity(int id) {
		return (Teacher) sessionFactory.getCurrentSession().get(Teacher.class, id);
	}
	@Transactional
	public List<Teacher> getEntities() {
		@SuppressWarnings("unchecked")
		List<Teacher> teachers = (List<Teacher>) sessionFactory.getCurrentSession()
				.createCriteria(Teacher.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return teachers;
		
	}

	public boolean updateEntity(Teacher Teacher) {
		// TODO Auto-generated method stub
		return false;
	}

}
