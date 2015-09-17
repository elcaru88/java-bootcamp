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
		implementation.getById(id);
		return null;
	}

	@Override
	public void update(User user) {
		implementation.update(user);
	}

	@Override
	public void delete(User user) {
		implementation.delete(user);
	}

}
