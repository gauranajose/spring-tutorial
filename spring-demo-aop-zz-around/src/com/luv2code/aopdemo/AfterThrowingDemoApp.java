package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccounts = null;	
		
		try {
			// add boolean to simulate an exception
			boolean tripWire = true;
			
			theAccounts = theAccountDAO.findAccounts(tripWire);
			
		} catch (Exception exc) {
			System.out.println("\nMain Program caught exception: " + exc);
		}
		
		System.out.println("\n\nMain Program: After Returning ...");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");
		
		
		
		
		// close spring contenxt
		context.close();

	}

}
