package com.cg.Dao;

import com.cg.Account;

public interface AccountDao {
	Account retrive(String currentuser);
	void InsertAccount(Account account);
}
