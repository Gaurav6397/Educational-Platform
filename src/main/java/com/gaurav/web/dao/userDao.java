 package com.gaurav.web.dao;
import java.sql.*;
import com.gaurav.web.model.User;

public class userDao {
	public User getData(int id) {
		User user = new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","12345");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from users where id = "+id);
			if(rs.next()) {
				user.setId(id);
				user.setName(rs.getString("name"));
				user.setJob(rs.getString("job"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return user;
	}
}
