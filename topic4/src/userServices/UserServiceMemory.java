package userServices;

import data.User;
import data.UserAccion;

public class UserServiceMemory implements UserService{
	UserAccion usrAc = new UserAccion();
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		usrAc.addUser(user);
	}

	@Override
	public User read(Integer id) {
		// TODO Auto-generated method stub
		return usrAc.getUser(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		usrAc.updateUser(user);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		usrAc.deleteUser(id);
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		usrAc.getUsers();
	}

	@Override
	public void createFriend(User user, User friend) {
		// TODO Auto-generated method stub
		usrAc.addFriends(user, friend);
	}

	@Override
	public void listFriends() {
		// TODO Auto-generated method stub
		usrAc.getFriends();
	}

}
