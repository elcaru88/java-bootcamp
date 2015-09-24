package entities;

import java.util.HashMap;

public class User {
	
	private int id;
	private String userName;
	private String userPass;
	private Picture userPicture;
	
	private HashMap< Integer , User> friends  =new HashMap< Integer, User>();
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPass=" + userPass + "]";
	}
	
	public User(int id, String userName, String userPass , Picture picture) {
		this.id = id;
		this.userName = userName;
		this.userPass = userPass;
		this.userPicture = picture;
	}
	
	public Picture getUserPicture() {
		return userPicture;
	}
	
	public void setUserPicture(Picture userPicture) {
		this.userPicture = userPicture;
	}
	
	public void showUserPicture() {
		this.userPicture.show();
	}
	
	public void addFriend( User friend) {
		friends.put(friend.getId(), friend);
	}
	
	public void listFriends(){
		if (friends.isEmpty()) {
			System.out.println("empty");
			
		}
		System.out.println("-----------------------------");
		System.out.println("\n "+ this.userName+" FRIENDS: \n" );
		for (User value : friends.values()) {
		     System.out.println(value.toString());
		}
		System.out.println("-----------------------------");
	}
	
	
	
	
	
	
	

}
