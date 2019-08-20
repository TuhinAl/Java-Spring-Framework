package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAppDemo {

	public static void main(String[] args) {
		
		
		// read configure file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		
		// retrieve bean 
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		// call method
		System.out.println(theCoach.getDailyWork());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close bean
		context.close();
	}

}
