package services;

import entities.User;

public interface ServiceUser {
	
	//create, read, update and delete
	
	public void create(User user);	
	public User getById(int id);	
	public void update(User user);	
	public void delete(int id);
	
	public void listUsers();
	
}