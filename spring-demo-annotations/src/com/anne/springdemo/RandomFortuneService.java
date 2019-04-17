package com.anne.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create a String Array
	
	private String[] data = {
		"I love Baye Diankha",
			"I am going to be Rich",
			"I will succeed and help many people"
	};
	
	// create a Random number generator
	Random myRandom = new Random();
	@Override
	public String getFortune() {
		
		//pick a Random String from the Array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune ;
	}

}
