package com.sapient.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.dao.UsersDao;
import com.sapient.entity.User;

@CrossOrigin
@RestController
public class UsersController {

	UsersDao dao = new UsersDao();
	
	@GetMapping("/api/users")
	public List<User> getAllUsers() {
		return dao.getAll();
	}
}
