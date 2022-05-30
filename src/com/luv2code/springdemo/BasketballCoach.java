package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Dunk that bih down the middle";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}








