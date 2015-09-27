package userServices;

import data.User;

public class UserServiceJmsCliente implements UserService {
	UserService jmsObject;
	

	
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		jmsObject.create(user);
	}

	@Override
	public User read(Integer id) {
		return jmsObject.read(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createFriend(User user, User friend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listFriends() {
		// TODO Auto-generated method stub
		
	}
	

}
