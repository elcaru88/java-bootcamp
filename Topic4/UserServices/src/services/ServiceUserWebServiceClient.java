package services;

import entities.User;

public class ServiceUserWebServiceClient implements ServiceUser {
	
	ServiceUser imp = new ServiceUserImp();  

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
	}

}
