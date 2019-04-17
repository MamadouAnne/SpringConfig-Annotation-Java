package com.anne.springdemo;


// @autowired annotation is option starting spring 4.3 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component

public class TennisCoach implements Coach {
	//filed injection , just use @autowired there is no need for setter and constructor methods 
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default contrucor");
	}
	//intit method
	public void doMyStarUpStaff() {
		System.out.println("inside init method");
	}
	
	//Destroy method
	public void doMyCleanUpStaff() {
		System.out.println("inside Destroy method");
	}
	/*@Autowired
	public void doSomethingCrazy(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomethingCrazy");
	
		this.fortuneService = fortuneService;
	}*/
	
	// define a setter method for injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setter method");

		this.fortuneService = fortuneService;
	}
*/
	
	@Autowired
	/*TennisCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {

		return "practice your back hand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
