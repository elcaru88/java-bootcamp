package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import model.Connect;
import model.Photo;
import model.User;
import model.Users;

public class UserServiceImplementation implements UserService {

	@Override
	public Users getUsers() {
		Users users = new Users();
		try {
			Connection con = Connect.getConnection();
			User user;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from users");
			while (rs.next()) {
				user = new User(rs.getString("userName"),
						rs.getString("userPass"), new Photo(
								rs.getString("userPhoto")));
				users.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public void createUser(User user) {
		try {
			Connection con = Connect.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into photo(userPhoto) values(?)");
			ps.setString(1, user.getUserPhoto().getUserPhoto());
			ps.execute();
			PreparedStatement ps2 = con
					.prepareStatement("insert into users(userName,userPass,userPhoto) values(?,?,?)");
			ps2.setString(1, user.getUserName());
			ps2.setString(2, user.getUserPass());
			ps2.setString(3, user.getUserPhoto().getUserPhoto());
			ps2.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User user) {
		try {
			Connection con = Connect.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into photo(userPhoto) values(?)");
			ps.setString(1, user.getUserPhoto().getUserPhoto());
			ps.execute();
			PreparedStatement ps2 = con
					.prepareStatement("update users set userPass =?,userPhoto=? where userName=?");
			ps2.setString(1, user.getUserPass());
			ps2.setString(2, user.getUserPhoto().getUserPhoto());
			ps2.setString(3, user.getUserName());
			ps2.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void addFriend(User user, User friend) {
		try {
			Connection con = Connect.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update users set friends =? where userName=?");
			ps.setString(1, friend.getUserName());
			ps.setString(2, user.getUserName());
			ps.execute();

			PreparedStatement ps2 = con
					.prepareStatement("update users set friends =? where userName=?");
			ps2.setString(1, user.getUserName());
			ps2.setString(2, friend.getUserName());
			ps2.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(String userName) {
		try {
			Connection con = Connect.getConnection();
			PreparedStatement ps = con
					.prepareStatement("delete from users where userName=?");
			ps.setString(1, userName);
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void likePhoto(User user) {
		try {
			Connection con = Connect.getConnection();
			int likes = 0;
			Statement st = con.createStatement();
			ResultSet rs = st
					.executeQuery("SELECT likes FROM photo ,users where "
							+ "photo.userPhoto = users.userPhoto  and users.userName = '"
							+ user.getUserName() + "'");
			while (rs.next()) {
				likes = rs.getInt("likes");
			}
			PreparedStatement ps = con
					.prepareStatement("update photo set likes =? where userPhoto=?");
			ps.setInt(1, likes + 1);
			ps.setString(2, user.getUserPhoto().getUserPhoto());
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
