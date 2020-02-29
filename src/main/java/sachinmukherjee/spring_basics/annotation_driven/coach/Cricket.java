package sachinmukherjee.spring_basics.annotation_driven.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sachinmukherjee.spring_basics.annotation_driven.service.Service;

@Component("cricketCoach")
public class Cricket implements Coach {
	
	private Service service;
	
	@Autowired
	public Cricket(Service service) {
		this.service = service;
	}

	public String getDailyTips() {
		return "Take DRS when necessary";
	}
	
	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
