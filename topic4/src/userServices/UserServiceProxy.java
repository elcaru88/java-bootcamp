package userServices;

import data.User;

public class UserServiceProxy implements UserService{
	UserService implementation;
	
	protected UserServiceProxy(UserService imp) {
		this.implementation = imp;
	}

	@Override
	public void create(User user) {
		implementation.create(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public User read(Integer id) {
		return implementation.read(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		implementation.update(user);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		implementation.delete(id);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		implementation.list();
	}

	@Override
	public void createFriend(User user, User friend) {
		// TODO Auto-generated method stub
		implementation.createFriend(user, friend);
	}

	@Override
	public void listFriends() {
		// TODO Auto-generated method stub
		implementation.listFriends();
	}

}
