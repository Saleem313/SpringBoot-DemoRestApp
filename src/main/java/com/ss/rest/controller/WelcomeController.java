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

	
    @GetMapping("/creator")
    public String greateCreator(){
       return "*****ALLAH**********";
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
