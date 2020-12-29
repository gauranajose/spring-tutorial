package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

	public String getName() {
		System.out.println(getClass() + "Getting name ...");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + "Setting name ...");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + "Getting service code ...");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + "Setting service code ...");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + "Doing my db work: Adding an account ...");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + "Doing work ...");
		return true;
	}
	
}
