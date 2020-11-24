package com.cg.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.User;

import com.cg.Service.AccountService;

import com.cg.Account;


@Controller
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	@RequestMapping(value="/account.htm",method=RequestMethod.GET)
    public String showAccountForm(Map<String,Account> map,HttpServletRequest req,Model model) 
    {  
        System.out.println("Inside showAccountForm()");
        map.put("account1",new Account());
        HttpSession session=req.getSession();
		User curr=(User)session.getAttribute("currentUser");
        Account x=service.validate(curr.getUsername());
        
        if(x==null)
        	return "AccountCreation";
        else {
        	model.addAttribute("x",x);
        	return "AccountError";
        }
    }
    
    @RequestMapping(value="/account.htm",method=RequestMethod.POST)
    public String validateLogin(@ModelAttribute("account")Account newaccount,HttpServletRequest req,Model model){
    	HttpSession session=req.getSession();
		User curr=(User)session.getAttribute("currentUser");
		System.out.println("Inside AccountController()");
		if(curr.getRolecode().equals("insured")) {
			newaccount.setUsername(curr.getUsername());
			service.addAccount(newaccount);
			return "AccountCreated";
		}
		Account x=service.validate(newaccount.getUsername());
		if(x==null) {
			service.addAccount(newaccount);
			return "AccountCreated";
		}
		model.addAttribute("x",x);
		return "AccountError";
     }
}
