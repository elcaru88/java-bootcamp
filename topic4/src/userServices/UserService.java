package userServices;



import java.sql.Array;

import data.User;

public interface UserService  {
	public void create(User user);
	public User read(Integer id);//User
	public void update(User user);
	public void delete(Integer id);
	public void list();
	
	public void createFriend(User user, User friend);
	public void listFriends();
	


}
