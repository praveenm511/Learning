package EventRegistration;

public class SingleEventRegistration extends EventRegistration{
	private int particpantNo;


	public int getParticpantNo() {
		return particpantNo;
	}

	public void setParticpantNo(int particpantNo) {
		this.particpantNo = particpantNo;
	}

	public SingleEventRegistration(String name, String nameOfEvent, int particpantNo) {
		super(name, nameOfEvent);
		this.particpantNo = particpantNo;
	}

	public void registerEvent() {
		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			System.out.println("Thank You "+this.getName()+" for your participation.Your registration fee is: "+100);
		} 
		else if(this.getNameOfEvent().equalsIgnoreCase("Sing&Win")){
			System.out.println("Thank You "+this.getName()+" for your participation.Your registration fee is: "+150);
		}
		else if(this.getNameOfEvent().equalsIgnoreCase("PlayAway")){
			System.out.println("Thank You "+this.getName()+" for your participation.Your registration fee is: "+130);
		}
	}
}
