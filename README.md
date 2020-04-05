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
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //Creating Container and reading all the from applicationContext.xml
Coach coach = context.getBean("cricketCoach",Coach.class);  //It creates the object
System.out.println(coach.getCoachName());	//Call for method
System.out.println(coach.getDailyTips());	//call for method
context.close();
</code>
<p>ApplicationContext is an interface in the org.springframework.context package and it has several implementations, and the ClassPathXmlApplicationContext is one of these.Main functionality of it is to Initialize Container and Manage Beans</p>
</br></br>
<h3>Inversion of Control and DI</h3>
<p>It is a pattern used to creating instance of objects that other object rely on without knowing at compile time which class will be used to provide the functionality</p>
<p><u>Constructor Injection</u></p>
<p>Here we are using applicationContext.xml, AppDI.java</p>
<code>
&#60;bean id="happyFortuneService" class="sachinmukherjee.spring_basics.services.HappyFortuneService"&#62;&#60;/bean&#62;

&#60;bean id="cricketCoach" class="sachinmukherjee.spring_basics.coach.Cricket"&#62;
&#60;constructor-arg ref="happyFortuneService"&#62;&#60;/constructor-arg&#62;
&#60;/bean&#62;

</code>

<p><u>Setter Injection</u></p>
<p>The Code Remains same as in the Constructor Injection  but the only difference is to change the xml file. </p>
<p>Instead of &#60constructor-arg ref="happyFortuneService" /> use &#60property name="setterMethodName" ref="happyFortuneService" />
