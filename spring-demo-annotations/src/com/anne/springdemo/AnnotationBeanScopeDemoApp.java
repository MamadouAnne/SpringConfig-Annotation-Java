package com.anne.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load xml configuration file from the bean
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
						
		//boolean
		Boolean result = (theCoach==alphaCoach);
		if (theCoach==alphaCoach) {
			System.out.println("\nPointing to the same object: " + result );
			System.out.println("\nLocation memory for theCoach: " + theCoach );
			System.out.println("\nLocation memory for alphaCoach: " + alphaCoach );
		}
		
		//close the context
		context.close();
	}

}
