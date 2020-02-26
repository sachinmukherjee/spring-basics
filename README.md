# spring-basics
Spring basics IOC and DI

<h3>Inversion of Control</h3>
<p>It is a principal where the control flow of a program is inverted. Instead of programmer the external source such as framework, service takes control of it. As name implies Inversion of control means we have inverted the control of creating the object from our own using new operator to container or framework</p>
<p>Here we will create object of Cricket Class</p>
<code>
&#60;bean id="cricketCoach" class="sachinmukherjee.spring_basics.coach.Cricket"&#62;&#60;/bean&#62;
</code>
</br>
<code>
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Coach coach = context.getBean("cricketCoach",Coach.class);
System.out.println(coach.getCoachName());
System.out.println(coach.getDailyTips());
context.close();
</code>
<p>ApplicationContext is an interface in the org.springframework.context package and it has several implementations, and the ClassPathXmlApplicationContext is one of these.Initialize Container and Manage Beans</p>
