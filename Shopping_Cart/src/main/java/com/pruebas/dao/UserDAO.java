package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.User;

public interface UserDAO {

	public boolean addEntity(User entity);
	public User getEntity (int id);
	public List<User> getEntities ();
	public boolean updateEntity (User entity);
}
