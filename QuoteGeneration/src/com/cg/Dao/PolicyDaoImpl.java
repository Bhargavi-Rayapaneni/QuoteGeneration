package com.cg.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.Account;
import com.cg.PolicyQuestions;

@Component(value="policydao")
public class PolicyDaoImpl implements PolicyDao {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<PolicyQuestions> retriveacc(String account_Number) {
		String query1="SELECT * FROM account WHERE account_Number=?";
		System.out.println("Before query1");
		List<Account> get1=template.query(query1,new Object[] {account_Number},BeanPropertyRowMapper.newInstance(Account.class));
		System.out.println("Before query2 Statement");
		String query2="SELECT * FROM policy_questions WHERE Bus_Seg_Id=(SELECT Bus_Seg_Id FROM business_segment WHERE Bus_Seg_Name=?)";
		if(get1.size()==0) {
			System.out.println("null");
			return null;
		}
		else {
			System.out.println("Before query2 "+get1.get(0).getBus_Seg_Name());
			List<PolicyQuestions> get2=template.query(query2,new Object[] {get1.get(0).getBus_Seg_Name()},BeanPropertyRowMapper.newInstance(PolicyQuestions.class));
			return get2;
		}
	}
}
