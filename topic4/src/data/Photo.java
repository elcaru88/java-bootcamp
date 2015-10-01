package data;

public class Photo {
	private String photoUser;
	private Integer photoLikes;
	
	public Photo(String photoUser, Integer photoLikes) {
		this.photoUser = photoUser;
		this.photoLikes = photoLikes;
	}

	public String getPhotoUser() {
		return photoUser;
	}

	public void setPhotoUser(String photoUser) {
		this.photoUser = photoUser;
	}

	public Integer getPhotoLikes() {
		return photoLikes;
	}

	public void setPhotoLikes(Integer photoLikes) {
		this.photoLikes++;
	}

	@Override
	public String toString() {
		return "Photo [photoUser=" + photoUser + ", photoLikes=" + photoLikes + "]";
	}
	
	

}
