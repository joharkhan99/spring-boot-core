package com.jka.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

//If the scope is declared prototype, then spring
//IOC container will create a new instance of that
//bean every time a request is made for that specific bean

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{
	
	public BaseballCoach() {
		System.out.println("In constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins in baseball!!";
	}
	
//	custom init method
//	@PostConstruct
//	public void doSomeStartStuff() {
//		System.out.println("This metod is used to perform some init or similar to constructor method");
//	}
	
//	custom destroy/end method
//	@PreDestroy
//	public void doSomeEndStuff() {
//		System.out.println("This metod is used to perform some end or similar to destructor method");
//	}

}
