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
<p>The Code Remains same as in the Constructor Injection  but the only difference is to change the xml file and define a setter method in class file </p>
<p>Instead of &#60constructor-arg ref="happyFortuneService" /> use &#60property name="setterMethodName" ref="happyFortuneService" /> </p>
<br>
<u>Value Injection</u>
<p>Same as Setter Injection but instead of defining a setter method in the Concreate class file define a property name and in xml file give value to that property file</p>
<p>&#60property name="propertyName" value="happyFortuneService" /&#62.</p>
<br>
<u>Value from Property File</u>
<p>Create a Property File in resources folder where your applicationContext.xml file resides and use key value pair to define values. In applicationContext.xml file defince a xml tag under a bean in which you want to inject values.</p>
<code>
	<!-- Reading property file -->
	<!-- Define this in applicationContext.xml file to read values from property file -->
	&#60 context:property-placeholder location="classpath:owner.properties"/> 
	
	owner.name = "Sachin";   //In property File
	
	<bean id="cricketCoach" class="" >
		<property name="propertyName" value="${owner.name}" />
	</bean>
</code>

#### DI using Annotations ###

<p>Dependency Injection using Annotation is simple. We dont have to define beans in xml file instead of that we have to use @Annotation to mark classes as bean. Using Annotations we can inject dependency using Constructor, Setter Method and Property Value.</p>
<p>Some Common Annotations are: </p>
<ul>
	<li>@Component(beanname="") - Defines a Class as a bean.</li>
	<li>@Qualifier(beanid="") - It resolves the autowiring conflict when multiple bean of same name are present</li>
	<li>AutoWired - It allows you to skip the configration elsewhere of what to inject and just does it for you. It is used with Constructor, setter, property values</li>
</ul>
<p>For Using annotation we have to declare component scan bean in applicationContext.xml file. like this</p>
<p>
	&#60;context:component-scan base-package="sachinmukherjee.spring_basics.annotation_driven.*">&#60; /context:component-scan>
</p>