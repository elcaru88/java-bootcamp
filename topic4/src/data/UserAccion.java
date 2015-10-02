package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserAccion {
	private ArrayList<User> users;
	private static Integer fix;
	
	private HashMap<Integer,User> friends;
	
	public UserAccion() {
		users = new ArrayList<>();
		fix=0;
		friends = new HashMap<>();
	}
	
	public void addUser(User user){
		//System.out.println(user);
		this.users.add(user);
				
	}
			
	public User getUser(int id){
		//System.out.println(id);
		return users.get(id);
	}
	public void updateUser(User usr){
		users.set(usr.getId(), usr);
	}
			
	public void deleteUser(int id){
		users.remove(id);
	}
			
	public void  getUsers() {
		Iterator<User> it = users.iterator();
		while(it.hasNext())
		  System.out.println(it.next());
		//System.out.println(users);
	}
	
	public void addLike(User usr) {
		usr.getPhoto().setPhotoLikes(1);
	}

	

	
/////////////////HASh MAPPPPPPPPPPPP
	
	
	public void getFriends() {
		Iterator it = friends.entrySet().iterator();
		while (it.hasNext()) {
		Map.Entry e = (Map.Entry)it.next();
		System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public void addFriends(User user, User friend) {
		friends.put(user.getId(), friend);
	}
	
	

}
