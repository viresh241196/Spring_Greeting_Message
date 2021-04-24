package com.example.demo.service;


import java.util.List;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(Long Id);
	List<Greeting> getAllGreetings();
	

}
