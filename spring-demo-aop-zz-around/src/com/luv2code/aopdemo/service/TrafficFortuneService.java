package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	 public String getFortune() {
		 
		// simulate delay
		 
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		// return fortune
		return "Expect heavy traffic this morning ...";
		
	 }
}
