package com.cg.Dao;

import java.util.List;

import com.cg.PolicyQuestions;

public interface PolicyDao {

	List<PolicyQuestions> retriveacc(String account_Number);

}
