package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")        //stereotype annotation
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("FestivalGreeting is created");
	}
	
	
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Diwali!";
	}

}