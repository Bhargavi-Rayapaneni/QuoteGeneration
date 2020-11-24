package com.cg.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.User;
import com.cg.Dao.LoginDao;

 

@Component(value="service")
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao dao;
    @Override
    public User validate(User user) {
        System.out.println("Inside Loginservice()");
        List<User> list = dao.retrieve();
        for(User login : list){
        	if(login.getUsername().equals(user.getUsername()) && login.getPassword().equals(user.getPassword())){
        		System.out.println("Match Found: "+login.getRolecode());
        		return login;
        	}
        }
        return null;
    }
}
 