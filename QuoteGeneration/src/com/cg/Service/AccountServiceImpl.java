package com.cg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.Account;
import com.cg.User;
import com.cg.Dao.AccountDao;

@Component(value="accountservice")
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao accountdao;

	@Override
	public Account validate(String currentuser) {
		Account retrive=accountdao.retrive(currentuser);
		return retrive;
	}

	@Override
	public void addAccount(Account newaccount) {
		accountdao.InsertAccount(newaccount);
	}
}
