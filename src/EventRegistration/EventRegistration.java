package EventRegistration;

public class EventRegistration {
	private String name;
	private String nameOfEvent;
	private double registrationFee;

	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public void registerEvent() {
		if (this.nameOfEvent.equalsIgnoreCase("ShakeALeg")) {
			System.out.println(this.nameOfEvent+"base fees is : "+100);
		} 
		else if(this.nameOfEvent.equalsIgnoreCase("Sing&Win")){
			System.out.println(this.nameOfEvent+"base fees is : "+150);
		}
		else if(this.nameOfEvent.equalsIgnoreCase("Actathon")){
			System.out.println(this.nameOfEvent+"base fees is : "+70);
		}
		else if(this.nameOfEvent.equalsIgnoreCase("PlayAway")){
			System.out.println(this.nameOfEvent+"base fees is : "+130);
		}
	}
}

