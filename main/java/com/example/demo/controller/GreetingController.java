package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.Greeting;
import com.example.demo.service.IGreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("") 
	public Greeting greeting(@RequestParam(value= "firstName", defaultValue="")String first,@RequestParam(value= "lastName", defaultValue="")String last) {
		User user = new User();
		user.setFirstName(first);
		user.setLastName(last);
		return greetingService.addGreeting(user);		
	}
	
	@GetMapping("getAllGreeting")
	public List<Greeting> fetchData() {
		List<Greeting> greetings=greetingService.getAllGreetings();
		return greetings;
	}
	
	@GetMapping("findById")
	public Greeting getGreetingById(@RequestParam(value="id",defaultValue="0")String id) {
		return greetingService.getGreetingById(Long.parseLong(id));
	}
}
