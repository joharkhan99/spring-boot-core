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
	
	// constructor injection (for required dependencies)
	// define a constructor for dependecny injection
	@Autowired
	public DemoController(Coach theCoach) {
		myCoach = theCoach;
	}

	// Qualifier is used to inject dependency explicitly/manually
	// also QUalifier inject has higher priority than primary annotaion
//	@Autowired
//	public DemoController(@Qualifier ("baseballCoach") Coach theCoach) {
//		myCoach = theCoach;
//	}
	
	// setter injection (for optional dependencies)
//	@Autowired
//	public void setCoach(Coach theCoach) {
//		myCoach = theCoach;
//	}
	
	
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	
}
