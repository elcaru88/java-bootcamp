package services;

import data.UserData;
import entities.User;

public class ServiceUserMemory implements ServiceUser{
	
	UserData userData = new UserData();

	@Override
	public void create(User user) {
		userData.addUser(user);		
	}

	@Override
	public User getById(int id) {
	       return userData.getUser(id);
	}

	@Override
	public void update(User user) {
		userData.upgradeUser(user);
	}

	@Override
	public void delete(int  id) {
		userData.deleteUser(id);
		
	}

	@Override
	public void listUsers() {
		userData.listUsers();
		
	}

	

}
