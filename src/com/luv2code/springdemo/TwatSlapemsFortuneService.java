package com.luv2code.springdemo;

import java.util.Random;

public class TwatSlapemsFortuneService implements FortuneService{
	
	private String[] data = {
		
			"if the meat is a bet, the twat will get wet", 
			"when its beautiful to the eye, its hard not to keep them guts dry", 
			"Slappy Twank is always trending"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
