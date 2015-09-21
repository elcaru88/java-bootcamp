package data;

import java.util.ArrayList;

import entities.User;

public class UserData {
	
	
	private ArrayList<User> usuarios =  new ArrayList<User>() ;
	
	
	public void addUser(User user){
		this.usuarios.add(user);
		System.out.println("User Created");;
	}
	
	public User getUser(int id){
		return usuarios.get(id);
	}
	
	public void deleteUser(int id){
		usuarios.remove(id);
	}
	
	public void upgradeUser(User u){
		usuarios.remove(u.getId());
		usuarios.add(u);
	}
	
	public void listarUsuarios(){
		for (User user : usuarios) {
			System.out.println( user.toString());
			System.out.println("----------");
		}
	}

}
