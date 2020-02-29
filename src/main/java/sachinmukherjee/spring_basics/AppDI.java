package sachinmukherjee.spring_basics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sachinmukherjee.spring_basics.coach.Coach;

public class AppDI {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Coach coach = context.getBean("hockeyCoach",Coach.class);
		System.out.println(coach.getCoachName());
		System.out.println(coach.getDailyTips());
		System.out.println(coach.getDailyFortune());
		//System.out.println(coach.);
		
	}
}
