package com.nttdata.bootcamp.gateway.gatewayserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(path="/micro1")
	public String helloMicro1() {
		return "Hello Micro1";
	}

}
