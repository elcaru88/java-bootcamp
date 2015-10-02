package model;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private List<User> users;

	public Users() {
		
		users = new ArrayList<User>();
		
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}
	
	public void add (User user){
		users.add(user);
	}

}
