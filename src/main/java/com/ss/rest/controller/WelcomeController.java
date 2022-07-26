package com.ss.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
    public WelcomeController() {
    	System.out.println("******************WelcomeController.WelcomeController()**************");
    }
    
    @GetMapping("/welcome")
    public  String welcome() {
    	System.out.println("********WelcomeController.welcome(***********)");
		return "Asslamualikum *** Welcome to RestApi development   ";
    	
    }
    
    
    @GetMapping("/greet")
    public  String welcome1( ) {
    	System.out.println("********WelcomeController.welcome1***********");
		return " *** Welcome to RestApi development ******** ";	
    }
}
