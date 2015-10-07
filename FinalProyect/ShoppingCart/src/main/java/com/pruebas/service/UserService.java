package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.UserDAO;
import com.pruebas.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;
	
	public boolean addEntity(User user) {
		return userDAO.addEntity(user);
	}
	
	public User getEntity(int id) {
		System.out.println("Service Get Entity Method");
		return userDAO.getEntity(id);
	}
	
	public List<User> getEntities() {
		List<User> result = new ArrayList<User>();
		for (User t : userDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}
	
	public boolean updateEntity(User user) {
		return userDAO.updateEntity(user);
	}
}
