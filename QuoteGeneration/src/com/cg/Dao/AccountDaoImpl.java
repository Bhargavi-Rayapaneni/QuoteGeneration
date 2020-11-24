package com.cg.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.Account;

@Component(value="accountdao")
public class AccountDaoImpl implements AccountDao{
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public Account retrive(String currentuser) {
		String query1="SELECT * FROM account WHERE username=?";
		List<Account> get = template.query(query1,new Object[] {currentuser}, BeanPropertyRowMapper.newInstance(Account.class));
		if(get.size()==0)
			return null;
		else
			return get.get(0);
	}
	
	@Override
	public void InsertAccount(Account account) {
		/*Integer baseaccNum=1000000000;
		String query1="SELECT COUNT(Acc_Number) FROM account";
		Integer count=template.queryForObject(query1, Integer.class);
		Integer newAccNum=baseaccNum+count+1;*/
		String query2="INSERT INTO account VALUES(?,?,?,?,?,?,?,?)";
		template.update(query2,account.getAccount_Number(),account.getInsured_Name(),account.getInsured_Street(),account.getInsured_City(),account.getInsured_State(),account.getInsured_Zip(),account.getBus_Seg_Name(),account.getUsername());
	}
}
