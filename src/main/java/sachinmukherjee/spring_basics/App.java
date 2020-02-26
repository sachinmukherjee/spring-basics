package sachinmukherjee.spring_basics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sachinmukherjee.spring_basics.coach.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("cricketCoach",Coach.class);
        System.out.println(coach.getCoachName());
        System.out.println(coach.getDailyTips());
        context.close();
    }
}
