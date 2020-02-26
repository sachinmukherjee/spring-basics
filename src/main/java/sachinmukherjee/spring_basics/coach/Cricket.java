package sachinmukherjee.spring_basics.coach;

import sachinmukherjee.spring_basics.services.Service;

public class Cricket implements Coach {
	
	private Service service;
	
	public Cricket(Service service) {
		this.service = service;
	}
	
	public String getCoachName() {
		return "Rahul Dravid";
	}

	public String getDailyTips() {
		return "Stay Calm";
	}
	
	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
