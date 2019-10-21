package com.sl;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		return "Practice running for 30 mins";
	}
	
	
	public String getDailyFortune()
	{
		return this.fortuneService.getFortune();
	}

}
