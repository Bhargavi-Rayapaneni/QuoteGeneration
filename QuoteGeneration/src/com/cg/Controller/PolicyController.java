package com.cg.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.Account;
import com.cg.PolicyQuestions;
import com.cg.Service.PolicyService;

@Controller
public class PolicyController {
	
	@Autowired
	@Qualifier("policyservice")
	private PolicyService service;
	
	@RequestMapping(value="/policycreate.htm",method=RequestMethod.GET)
	public String showProfile() {
		return "PolicyCreation";
	}
	@RequestMapping(value="/accountno.htm",method=RequestMethod.POST)
	public String getpolicyques(String account_Number,Model model,HttpServletRequest Req) {
		System.out.println(account_Number);
		List<PolicyQuestions> getBus=service.getQuestions(account_Number);
		for(int i=0;i<getBus.size();++i) {
			System.out.println(getBus.get(i).getPol_Ques_Id());
		}
		Req.setAttribute("ques", getBus);
		return "Questions";
	}
	
}
