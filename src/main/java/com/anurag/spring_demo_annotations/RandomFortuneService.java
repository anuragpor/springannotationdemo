package com.anurag.spring_demo_annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] data = {
			"Anurag", "Tejas", "Divya", "Ragini", "Vinod"
	};
	
	
	private Random myRandom = new Random();
	public String getFortune() {
		
		int idx = myRandom.nextInt(data.length);
		
		String theFortune = data[idx];
		
		return theFortune;
	}

}
