package service;

import model.User;
import model.Users;

public interface UserService {

	public Users getUsers();
	
	public void createUser(User user);

	public void updateUser(User user);

	public void deleteUser(String userName);
	
	public void addFriend(User user, User friend);
	
	public void likePhoto(User user);

}
