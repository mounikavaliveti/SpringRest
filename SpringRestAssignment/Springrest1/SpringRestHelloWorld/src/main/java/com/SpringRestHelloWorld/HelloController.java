package com.SpringRestHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService a;
	@GetMapping("hello")
	public String sayHello() {
		return a.hello();
	}
	
}
