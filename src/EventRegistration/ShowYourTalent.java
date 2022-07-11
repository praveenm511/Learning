package EventRegistration;

public class ShowYourTalent {

	public static void main(String[] args) {
		SingleEventRegistration singleEventRegistration1= new SingleEventRegistration("Jenny","Sing&Win", 1);
		SingleEventRegistration singleEventRegistration2= new SingleEventRegistration("Hudson","PlayAway", 2);
		TeamEventRegistration teamEventRegistration = new TeamEventRegistration("Aura","ShakeALeg", 5, 1);
		
		singleEventRegistration1.registerEvent();
		teamEventRegistration.registerEvent();
		singleEventRegistration2.registerEvent();
	}

}
