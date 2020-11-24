package com.cg.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.User;

@Component(value="profiledao")
public class ProfileDaoImpl implements ProfileDao {
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void InsertProfile(User user) {
		String query1="INSERT INTO userrole VALUES(?,?,?)";
		template.update(query1,user.getUsername(),user.getPassword(),user.getRolecode());
	}
}
