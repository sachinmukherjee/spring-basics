package sachinmukherjee.spring_basics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sachinmukherjee.spring_basics.annotation_driven.coach.Coach;

public class AppAnnotation {

	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Coach coach = context.getBean("cricketCoach",Coach.class);
		System.out.println(coach.getDailyTips());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
