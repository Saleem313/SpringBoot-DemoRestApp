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
	
	@GetMapping("/newMethod")
	public string newMethod(){
		return "***new Method;
	}

	@GetMapping("/thanks")
	public string greetMsg2(){
		return "****thanks******";
	}
     @GetMapping("/newMethod")
    public String greetMethod(){
	return "***this is newMethod ****";
    }
	
	
}
