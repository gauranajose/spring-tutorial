package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {
	
	// define private field for the dependency
		private FortuneService fortuneService;
		
	// define a constructor for the dependency injection
	public BadmintonCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 4 sets of 50 smashes.";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

		
}
