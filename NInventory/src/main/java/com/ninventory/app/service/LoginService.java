package com.ninventory.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninventory.app.model.Users;
import com.ninventory.app.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository repository;
	
	
	public List<Users> findUserbyEmail(String email) {

		return repository.findByEmail(email);
	}

}
