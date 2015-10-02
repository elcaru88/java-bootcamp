package service;

import model.User;
import model.Users;

public class UserServiceWebService implements UserService{

	UserService implementation  = new UserServiceImplementation();

	@Override
	public Users getUsers() {
		
		return implementation.getUsers();
	}

	@Override
	public void createUser(User user) {
		implementation.createUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		implementation.updateUser(user);
		
	}


	@Override
	public void addFriend(User user, User friend) {
		implementation.addFriend(user, friend);
		
	}

	@Override
	public void deleteUser(String userName) {
		implementation.deleteUser(userName);
		
	}

	@Override
	public void likePhoto(User user) {
		implementation.likePhoto(user);
		
	} 
}
