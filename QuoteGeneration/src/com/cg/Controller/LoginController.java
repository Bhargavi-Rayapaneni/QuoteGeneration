package com.cg.Controller;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.User;
import com.cg.Service.LoginService;

 

@Controller
public class LoginController{
    @Autowired
    private LoginService service;
    
    @RequestMapping(value="/login.htm",method=RequestMethod.GET)
    public String showLoginForm(Map<String,User> map) 
    {  
        System.out.println("Inside showLoginForm()");
        map.put("login",new User());
        return "login";
    }
    
    @RequestMapping(value="/login.htm",method=RequestMethod.POST)
    public String validateLogin(@ModelAttribute("login")User user,HttpServletRequest req)
    {
    	System.out.println("Inside LoginController()");
        User login = service.validate(user);
        if(login!=null)
        {
            String roleCode = login.getRolecode();
            HttpSession session=req.getSession();
        	session.setAttribute("currentUser", login);
            if(roleCode.equals("underwriter")){
            	return "Admin";             
            }
            else if(roleCode.contentEquals("agent"))
            {
                return "Agent";
            }
            else if(roleCode.contentEquals("insured"))
            {
                return "Insured";
            }
        }
        else
        {
            return "redirect:login.htm";
        }
        return null;
}
  

    
}
 