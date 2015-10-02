package service;

import model.User;
import model.Users;

public class UserServiceJmsClient implements UserService{

	 UserService jmsObject; 
	
	 public UserServiceJmsClient() {  
	        //jmsObject = code to get the reference to Service A from the jms call
		 jmsObject = new UserServiceImplementation();
	    }  
	 
	@Override
	public Users getUsers() {
		return jmsObject.getUsers();
	}

	@Override
	public void createUser(User user) {
		jmsObject.createUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		jmsObject.updateUser(user);
		
	}

	

	@Override
	public void addFriend(User user, User friend) {
		jmsObject.addFriend(user, friend);
		
	}

	@Override
	public void deleteUser(String userName) {
		jmsObject.deleteUser(userName);
		
	}

	@Override
	public void likePhoto(User user) {
		jmsObject.likePhoto(user);
		
	}

}
