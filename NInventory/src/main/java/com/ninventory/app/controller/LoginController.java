package com.ninventory.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ninventory.app.model.Users;

@Controller
public class LoginController {
	  @GetMapping(value = "/")
	  public String available(Model model) {
		model.addAttribute("user1", new Users()); 
	    return "login/login";
	  }
	  
	  @PostMapping(value ="/login")
	  public void Login( Users user ) {
		System.out.println(user.getName());  
		  
		  
	  }
	  
	  
	  
	  
	  
	  
}
