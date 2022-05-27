package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class BasketballCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public BasketballCoach() {
		System.out.println(">> BasketballCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Dunk that bih down the middle";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
	}

}








