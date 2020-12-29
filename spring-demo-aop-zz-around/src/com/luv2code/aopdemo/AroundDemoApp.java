package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get bean from spring container
		TrafficFortuneService fortuneService = 
				context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nMain Program: Around Demo App");
		
		System.out.println("Calling getFortune");
		
		String data = fortuneService.getFortune();
		
		System.out.println("\nFortune: " + data);
		
		System.out.println("Finished ...");
		
		// close spring contenxt
		context.close();

	}

}
