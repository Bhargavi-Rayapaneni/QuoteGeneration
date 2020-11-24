package com.cg.Controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.Service.ProfileService;
import com.cg.User;

@Controller
public class ProfileController {
	
	@Autowired
	@Qualifier(value="profileservice")
	private ProfileService profileservice;
	
	 @RequestMapping(value="/profile.htm",method=RequestMethod.GET)
	 public String showProfileForm(Map<String,User> map){
		 System.out.println("Inside showLoginForm()");
		 map.put("profi",new User());
		 return "ProfileCreation";
	 }
	 
	 @RequestMapping(value="/profile.htm",method=RequestMethod.POST)
	 public String addProfile(@ModelAttribute("profi")User user) {
		 
		 System.out.println("Inside createAccount of profileController");
		 profileservice.addProfile(user);
		 return "success";
	 }
	 
}
