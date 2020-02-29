package sachinmukherjee.spring_basics.annotation_driven.service;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements Service {

	public String getDailyFortune() {
		return "Stay Happy Always";
	}

}
