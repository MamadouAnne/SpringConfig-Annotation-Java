package com.anne.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "tacle hard, run har";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
