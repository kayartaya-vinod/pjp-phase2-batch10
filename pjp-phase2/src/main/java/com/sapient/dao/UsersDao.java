package com.sapient.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sapient.entity.User;
import com.sapient.utils.DbUtil;

public class UsersDao {

	// CRUD operations
	public void create(User user) {
		
	}
	public User getById(Integer id) {
		return null;
	}
	
	public void update(User user) {
		
	}
	
	public void delete(Integer id) {
		
	}
	
	// QUERY operations
	
	public List<User> getAll(){
		
		String sql = "select * from users";
		List<User> users = new ArrayList<>();
		
		try(
			Connection conn = DbUtil.createConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		) {
			while(rs.next()) {
				// we have access to a single record at a time

				// create a new User object
				User u = new User();
				
				// transfer values from "rs" to the new User object
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("first_name"));
				u.setLastname(rs.getString("last_name"));
				u.setCity(rs.getString("city"));
				u.setGender(rs.getString("gender"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));
				
				// add it to the collection "users"
				users.add(u);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return users;
	}
	
	public User getByEmail(String email) {
		return null;
	}
	
	public User getByPhone(String phone) {
		return null;
	}
	
	public List<User> getByCity(String city) {
		return null;
	}
	
}
