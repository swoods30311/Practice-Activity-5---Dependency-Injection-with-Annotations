package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class BasketballConfig {
		
	// define bean for our happy fortune service
	@Bean
	public FortuneService poppyGutsSlammyFortuneService() {
		return new PoppyGutsSlammyFortuneService();
	}
	
	// define bean for our bball coach AND inject dependency
	@Bean
	public Coach basketballCoach() {
		BasketballCoach myBasketballCoach = new BasketballCoach(poppyGutsSlammyFortuneService());
		return myBasketballCoach;
	}
	
}








