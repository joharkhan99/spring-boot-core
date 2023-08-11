package com.jka.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// lazy means that it will not be initialized unless needed
//@Lazy
@Component
public class TennisCoach implements Coach{
	
	public TennisCoach() {
		System.out.println("In constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Long Tennis everyday";
	}

}
