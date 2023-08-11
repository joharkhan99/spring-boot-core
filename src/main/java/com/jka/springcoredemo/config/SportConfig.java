package com.jka.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jka.springcoredemo.common.Coach;
import com.jka.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

	
//	this is alternative to @Component annotation. and we can give custom Id and then use it in Qualifiers
	@Bean("AquaMan")
	public Coach swimCoach() {
		return new SwimCoach();
	}
	
}
