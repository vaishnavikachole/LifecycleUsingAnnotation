package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
{
	private String subject;

	public Example() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("setter");
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}
	
	
	

}
