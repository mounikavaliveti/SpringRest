package com.SpringRestPincode.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringRestPincode.Entity.Pincode;
@Service
public class ServicePincode implements ServicePin {
	
	List<Pincode> pin;

	public ServicePincode() {
		pin = new ArrayList<>();
		pin.add(new Pincode(500055,"Telangana","balapur","India"));
		pin.add(new Pincode(500056,"Telangana","balanagar","India"));
		pin.add(new Pincode(500057,"Telangana","balajinagar","India"));
				
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
