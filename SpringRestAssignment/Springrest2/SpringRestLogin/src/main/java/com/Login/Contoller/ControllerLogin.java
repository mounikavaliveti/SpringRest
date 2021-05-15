package com.Login.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Login.entity.User;
import com.Login.service.UserService;

@RestController
public class ControllerLogin {
	@Autowired
	UserService s;
	@PostMapping("/login")

	public String checkUser(@RequestBody User u1)
	{
		System.out.println(u1.getUserName()+" "+u1.getPassword());
		return s.check(u1);
		
	}
	
}
