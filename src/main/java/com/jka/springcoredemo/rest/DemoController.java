package com.jka.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jka.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
	// define private field for dependency
	private Coach myCoach;
	private Coach anotherCoach;
	
	// constructor injection (for required dependencies)
	// define a constructor for dependency injection
//	@Autowired
//	public DemoController(Coach theCoach) {
//		myCoach = theCoach;
//	}

	// Qualifier is used to inject dependency explicitly/manually
	// also QUalifier inject has higher priority than primary annotaion
	@Autowired
	public DemoController(@Qualifier ("baseballCoach") Coach theCoach,
			@Qualifier("baseballCoach") Coach theAnotherCoach) {
		
		System.out.println("In constructor: "+ getClass().getSimpleName());
		
		myCoach = theCoach;
		anotherCoach = theAnotherCoach;
	}
	
	// setter injection (for optional dependencies)
//	@Autowired
//	public void setCoach(Coach theCoach) {
//		myCoach = theCoach;
//	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	
	@GetMapping("/check")
	public String check() {
		return "Comparing beans: myCoach == anotherCoach, "+(myCoach == anotherCoach);
	}
	
}
