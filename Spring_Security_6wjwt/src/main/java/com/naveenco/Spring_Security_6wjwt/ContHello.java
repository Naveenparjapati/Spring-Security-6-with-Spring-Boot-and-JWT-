package com.naveenco.Spring_Security_6wjwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContHello {
	
	@RequestMapping("/")
    public String greet() {
        return "Hello World, Welcome to Telusko";
    }

}
