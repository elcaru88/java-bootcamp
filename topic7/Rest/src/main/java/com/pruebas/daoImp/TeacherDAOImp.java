package com.pruebas.daoImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.TeacherDAO;
import com.pruebas.model.Course;
import com.pruebas.model.Teacher;

@Repository
public class TeacherDAOImp implements TeacherDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public TeacherDAOImp() {
		
	}
	
	public TeacherDAOImp(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public boolean addEntity(Teacher teacher) {
		return (Boolean) sessionFactory.getCurrentSession().save(teacher);
	}
	
	@Transactional
	public Teacher getEntity(int id) {
		return (Teacher) sessionFactory.getCurrentSession().get(Course.class, id);
	}
	
	@Transactional
	public List<Teacher> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateEntity(Teacher Teacher) {
		// TODO Auto-generated method stub
		return false;
	}

}
