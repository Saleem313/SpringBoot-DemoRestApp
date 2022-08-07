package com.ss.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
    public WelcomeController() {
    	System.out.println("******************WelcomeController.WelcomeController()**************");
    }
	
    @GetMapping("/creator")
    public String greateCreator(){
       return "*****ALLAH**********";
    }
    @GetMapping("/greetMsg")
    public String greetMsg(){
		System.out.print("HI Welcome to GreetMsg");
	   return "***Happy Coding***";
    }		

}
