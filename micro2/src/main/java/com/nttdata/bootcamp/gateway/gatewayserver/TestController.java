package com.nttdata.bootcamp.gateway.gatewayserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(path="/micro2")
	public String helloMicro2() {
		return "Hello Micro2";
	}

}
