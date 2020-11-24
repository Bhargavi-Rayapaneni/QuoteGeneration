package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.PolicyQuestions;
import com.cg.Dao.PolicyDao;

@Component(value="policyservice")
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	@Qualifier("policydao")
	private PolicyDao dao;
	
	/*@Override
	public List<PolicyQuestions> getQuestions(int accountno) {
		List<PolicyQuestions> retrive=dao.retriveacc(accountno);
		return retrive;
	}*/

	@Override
	public List<PolicyQuestions> getQuestions(String account_Number) {
		List<PolicyQuestions> retrive=dao.retriveacc(account_Number);
		return retrive;
		
	}

}
