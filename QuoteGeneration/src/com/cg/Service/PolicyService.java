package com.cg.Service;

import java.util.List;

import com.cg.PolicyQuestions;

public interface PolicyService {

	List<PolicyQuestions> getQuestions(String account_Number);

}
