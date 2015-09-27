package service;

import model.User;
import model.Users;

public class UserServiceWebServiceClient implements UserService{
	
	UserService webService;
	
	 public UserServiceWebServiceClient() {  
	        //webService = code to get the reference to Service A from the webservice call
		 webService = new UserServiceImplementation();
	    } 

	@Override
	public Users getUsers() {
	return webService.getUsers();
	}

	@Override
	public void createUser(User user) {
		webService.createUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		webService.updateUser(user);
		
	}

	

	@Override
	public void addFriend(User user, User friend) {
		webService.addFriend(user, friend);
		
	}

	@Override
	public void deleteUser(String userName) {
		webService.deleteUser(userName);
		
	}

	@Override
	public void likePhoto(User user) {
		webService.likePhoto(user);
		
	}
	
	

}
