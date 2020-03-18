package com.ninventory.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ninventory.app.model.Users;
import com.ninventory.app.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	LoginService lg;
	
	@GetMapping(value = "/")
	public String available(Model model) {
		model.addAttribute("user", new Users()); 
	
		System.out.println(lg.findUserbyEmail("anjanx44@gmail.com"));
	
		return "login/login";
	
	}
  
	
	
	@PostMapping(value ="/login")
	public void Login( Users user ) {
		//System.out.println(user.getEmail());  
		  
	}
	  

}
