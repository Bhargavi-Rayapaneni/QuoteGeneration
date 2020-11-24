package com.cg.Service;

import com.cg.Account;

public interface AccountService {

	Account validate(String currentuser);

	void addAccount(Account newaccount);

}
