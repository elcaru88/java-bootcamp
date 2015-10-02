package model;

public class Photo {
	
	private String userPhoto;

	public Photo(String userPhoto) {
		super();
		this.userPhoto = userPhoto;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userPhoto == null) ? 0 : userPhoto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Photo other = (Photo) obj;
		if (userPhoto == null) {
			if (other.userPhoto != null)
				return false;
		} else if (!userPhoto.equals(other.userPhoto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Photo [userPhoto=" + userPhoto + "]";
	}
	
	
	

}
