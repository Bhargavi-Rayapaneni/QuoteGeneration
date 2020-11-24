package com.cg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.User;
import com.cg.Dao.ProfileDao;

@Component(value="profileservice")
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	@Qualifier(value="profiledao")
	private ProfileDao profiledao;

	@Override
	public void addProfile(User user) {
		profiledao.InsertProfile(user);
	}

}
