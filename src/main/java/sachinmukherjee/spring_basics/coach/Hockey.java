package sachinmukherjee.spring_basics.coach;

import sachinmukherjee.spring_basics.services.Service;

public class Hockey implements Coach{

	private Service service;
	private String owner;
	private String surname;
	
	public Hockey() {
		
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void setOwnerName(String owner) {
		this.owner = owner;
	}
	
	public void setOwnerSurname(String surname) {
		this.surname = surname;
	}
	
	public String getCoachName() {
		return this.owner;
	}
	
	public String getOwnerSurname() {
		return this.surname;
	}
	
	public void welcome() {
		System.out.println("Created by Sachin Mukherjee");
	}
	
	public void goodBye() {
		System.out.println("See you Soonnn!!");
	}
	public String getDailyTips() {
		return "Play with Straight Hand";
	}

	public String getDailyFortune() {
		return service.getDailyFortune();
	}
	
	
}
