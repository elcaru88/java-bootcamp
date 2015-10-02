package model;

public class User {
	
	private String userName  , userPass ;
	private Photo userPhoto;
	private Users friends;
	
	public User(String userName, String userPass, Photo userPhoto) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userPhoto = userPhoto;
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

	public Photo getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(Photo userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPass=" + userPass
				+ ", userPhoto=" + userPhoto + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPass == null) {
			if (other.userPass != null)
				return false;
		} else if (!userPass.equals(other.userPass))
			return false;
		return true;
	}
	
	public void addFriend( User friend) {
		friends.add(friend);
	}

	public String getFriends(){
		return friends.toString();
	}
}
