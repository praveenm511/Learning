package EventRegistration;

public class TeamEventRegistration extends EventRegistration{
	private int noOfParticipants;
	private int teamNo;
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public void registerEvent() {
		int baseFee=0;
		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			baseFee=50;
		} 
		else if(this.getNameOfEvent().equalsIgnoreCase("Sing&Win")){
			baseFee=60;
		}
		else if(this.getNameOfEvent().equalsIgnoreCase("Actathon")){
			baseFee=80;
		}
		else if(this.getNameOfEvent().equalsIgnoreCase("PlayAway")){
			baseFee=100;
		}
		int registrationFee=baseFee*this.getNoOfParticipants();
		System.out.println("Thank You "+this.getName()+" for your participation.Your team registration fee is: "+registrationFee);
	}
}
