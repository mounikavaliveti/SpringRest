package com.SpringRestPincode.Service;

import org.springframework.stereotype.Service;

import com.SpringRestPincode.Entity.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}
