package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService {

	private String[] fortunes;
	
	public RandomFortuneService() {
		fortunes = new String[3];
		
		fortunes[0] = "Today is your Lucky Day.";
		fortunes[1] = "Be careful of injuries.";
		fortunes[2] = "You have a minimal chance of losing.";
	}
	
	public String getFortune() {
		Random rand = new Random();
		int ctr = rand.nextInt(3);
		return fortunes[ctr];
	}
	
}
