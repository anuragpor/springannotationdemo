package com.anurag.spring_demo_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  // if we dont mention beam id then it will be class name with first letter small
@Component("tennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService") // when there many beans we specify the beanId
	private FortuneService fortuneService; // using java technology called reflection it will set the field automatically by using autowired this is called field injection no need for constrictor or setters based injeciton
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constrictpr");
	}
	
	@PostConstruct // initialization work will exucutes after the beam is constructed
	public void doMyStartupStuff() {
		System.out.println(">> Tennis: inside of doMyStartupStuff() ");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> Tennis: inside of doMyCleanUpStuff() ");
	}
	
	// define a setter method
//	@Autowiredaa
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fortuneService = theFortuneService;
//	}
	
	//autowired on constructor
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService; // spring creates the instance of it inject 
//	}
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}
	

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
