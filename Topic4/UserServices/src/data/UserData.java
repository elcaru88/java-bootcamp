package data;


import java.util.HashMap;



import entities.User;

public class UserData {
	
	
	//private ArrayList<User> users =  new ArrayList<User>() ;
	
	private HashMap< Integer , User> users =new HashMap< Integer, User>();
	
	public void addUser(User u){
		users.put(u.getId(), u);	 
	}
	
	public void deleteUser(int id){
		users.remove(id);
	}
	
	public User getUser(int id){
		return users.get(id);
	}
	
	public void upgradeUser(User u){
		users.remove(u.getId());
		users.put(u.getId(), u);
	}
	
	public void listUsers(){
		for (User value : users.values()) {
		     System.out.println(value.toString());
		}
	}

}
