package com.sl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// Create a Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve Bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

		// call the methods
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.emailAddress);
		System.out.println(cricketCoach.team);

		// close the container
		context.close();

	}

}
