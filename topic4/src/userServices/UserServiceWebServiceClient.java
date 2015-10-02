package userServices;

import data.User;

public class UserServiceWebServiceClient implements UserService {
	UserService webService;

	public UserServiceWebServiceClient() {
		UserService usi = new UserServicesImp();
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User read(Integer id) {
		return null;
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

	@Override
	public void addLike(User user) {
		// TODO Auto-generated method stub
		
	}
	

}
