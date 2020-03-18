package com.ninventory.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninventory.app.model.Users;

public interface LoginRepository extends JpaRepository<Users, Long> {
	 
	   List<Users> findByEmail(String email);
	 
}