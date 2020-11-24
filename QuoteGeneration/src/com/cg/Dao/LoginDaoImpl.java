package com.cg.Dao;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.User;

 

@Component(value="dao")
public class LoginDaoImpl implements LoginDao{
    @Autowired
    private JdbcTemplate template;
    
    @Override
    public List<User> retrieve() {
    	System.out.println("Inside LoginDAO()");
        String sql = "SELECT * FROM userrole";
        List<User> get = template.query(sql, BeanPropertyRowMapper.newInstance(User.class));
        for(User login : get){
        	System.out.println(login.getUsername());
        }
        return get;
    }
}
 