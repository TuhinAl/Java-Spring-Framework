package com.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;     

@Component
public class TennisCoach implements Coach {
	
	//field injection
	
	@Autowired
	@Qualifier("databaseFortuneSrvice")
	private FortuneService fortuneService;
	
	public TennisCoach(){
		
	}	
	
	// setter injection
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
	
	// Constructor Injection
	/*
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {	
		fortuneService = thefortuneService;
	}
        */
	
		
	@Override
	public String getDailyWork() {
		
		return "Practice  15 minutes Daily ";
	}

	
	
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
		
}
