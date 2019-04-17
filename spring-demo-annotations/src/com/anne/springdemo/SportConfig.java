package com.anne.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for our StrongFortuneService
	
	@Bean
	public FortuneService happyFortuneService() {
		
		return new HappyFortuneService();
	}
	
	// define bean for our SwimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		
		
		
		return new SwimCoach(happyFortuneService());
	}
}
