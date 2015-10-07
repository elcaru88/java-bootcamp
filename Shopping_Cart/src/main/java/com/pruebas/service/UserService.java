package com.pruebas.service;

import java.util.List;

import com.pruebas.model.User;

public interface UserService {

	public boolean addEntity(User user);

	public User getEntity(int id);

	public List<User> getEntities();

	public boolean updateEntity(User user);
}
