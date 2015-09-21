package services;

import entities.User;

public class ServiceUserProxy implements ServiceUser {
	
	ServiceUser implementation;  
	  
    protected ServiceUserProxy(ServiceUser imp) {  
        this.implementation = imp;  
    }  

	@Override
	public void create(User user) {
		implementation.create(user);
	}

	@Override
	public User getById(int id) {
		return implementation.getById(id);
	}

	@Override
	public void update(User user) {
		implementation.update(user);
	}

	@Override
	public void delete(int id) {
		implementation.delete(id);
	}

	@Override
	public void listUsers() {
		implementation.listUsers();
	}

}
