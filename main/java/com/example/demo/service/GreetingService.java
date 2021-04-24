package com.example.demo.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {
	private static final String template ="Hello, %s!";
	private static final AtomicLong counter =new AtomicLong();

	@Autowired
	private GreetingRepository greetingRepository;
	
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template,(user.toString().isEmpty()?"World":user.toString()));
		return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
	}
	

	
	@Override
	public List<Greeting> getAllGreetings(){
		List<Greeting> list=greetingRepository.findAll();
		return list;
	}
}
