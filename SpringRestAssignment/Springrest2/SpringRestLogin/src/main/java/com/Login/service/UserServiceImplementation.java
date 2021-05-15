package com.Login.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Login.entity.User;

@Service
public class UserServiceImplementation implements UserService {

	List<User> users;

	public UserServiceImplementation() {
		users = new ArrayList<>();
		users.add(new User("Mounika", "Mounika"));
		users.add(new User("laxman", "Sharanya"));
		users.add(new User("harika", "icecream"));
		users.add(new User("rakshi", "rakshi"));
		users.add(new User("kishan", "kishan"));
		users.add(new User("Kalyan", "Kalyan"));
		users.add(new User("rajith", "rajith"));
		users.add(new User("ramya", "ramya"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
