package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.UserDAO;
import com.pruebas.model.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDAO userDao;

	public boolean addEntity(User user) {
		userDao.addEntity(user);
		return true;
	}

	public User getEntity(int id) {
		User result = userDao.getEntity(id);
		return result;
	}

	public List<User> getEntities() {
		List<User> result = new ArrayList<User>();
		for (User user : userDao.getEntities()) {      //
			result.add(user);
		}
		return result;
	}

	public boolean updateEntity(User user) {
		userDao.updateEntity(user);
		return true;
	}

}
