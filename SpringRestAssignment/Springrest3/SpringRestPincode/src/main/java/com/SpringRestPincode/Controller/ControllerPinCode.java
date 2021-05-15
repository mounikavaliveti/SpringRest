package com.SpringRestPincode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestPincode.Entity.Pincode;
import com.SpringRestPincode.Service.ServicePin;

@RestController
public class ControllerPinCode {
	
	@Autowired
	ServicePin s;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}
