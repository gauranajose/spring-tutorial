package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KarateCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do 50 axe kicks.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
