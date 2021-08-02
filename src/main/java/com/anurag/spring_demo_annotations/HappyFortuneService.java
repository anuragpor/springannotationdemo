package com.anurag.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("inside happyfortuneservice constructor");
	}
	public String getFortune() {
		return "Today is your lucky day";
	}
}
