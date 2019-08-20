package com.annotation.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneSrvice implements FortuneService {
	 

	private String [] inputString  = { "Hey what are you doingnow","I am kind of busy","Stay Tuned","See you tomorrow"};
	
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(inputString.length);
		String result = inputString[index];
		return result;
		
		
	}

}
