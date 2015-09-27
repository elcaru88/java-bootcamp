package data;

public class User {
	private Integer id;
	private String name;
	private String password;
	private Photo photo;
	
	public User(Integer id, String name, String password, Photo photo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.photo = photo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", photo=" + photo + "]";
	}
	
	
	}
