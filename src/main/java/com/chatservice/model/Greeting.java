package com.chatservice.model;

public class Greeting {
	
	private String greeting;

	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	
	public Greeting(String name) {
		this.greeting = "Hello, " + name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
