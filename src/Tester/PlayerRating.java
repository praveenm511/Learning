package Tester;

public class PlayerRating {
	private int playerPosition;
	private String playerName;
	private float critic1rating;
	private float critic2rating;
	private float critic3rating;
	private float avgRating;
	private char category;

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public float getCritic1rating() {
		return critic1rating;
	}

	public void setCritic1rating(float critic1rating) {
		this.critic1rating = critic1rating;
	}

	public float getCritic2rating() {
		return critic2rating;
	}

	public void setCritic2rating(float critic2rating) {
		this.critic2rating = critic2rating;
	}

	public float getCritic3rating() {
		return critic3rating;
	}

	public void setCritic3rating(float critic3rating) {
		this.critic3rating = critic3rating;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public PlayerRating(int playerPosition, String playerName) {
		super();
		this.playerPosition = playerPosition;
		this.playerName = playerName;
	}

	public void calculateAverageRating(float critic1rating,float critic2rating) {
		float avg=(critic1rating+critic2rating)/2;
		System.out.println(avg);
		if(avg>8)
			System.out.println('A');
		else if (avg>5 && avg<=8)
			System.out.println('B');
		else if (avg>0 && avg<=5)
			System.out.println('C');
	}

	public void calculateAverageRating(float critic1rating,float critic2rating,float critic3rating) {
		float avg=(critic1rating+critic2rating+critic3rating)/3;
		System.out.println(avg);
		if(avg>8)
			System.out.println('A');
		else if (avg>5 && avg<=8)
			System.out.println('B');
		else if (avg>0 && avg<=5)
			System.out.println('C');
	}

	public static void main(String[] args) {
		PlayerRating beckham =new PlayerRating(1, "Beckham");
		PlayerRating oscar =new PlayerRating(1, "Oscar");
		beckham.calculateAverageRating(9.0f,9.9f);
		oscar.calculateAverageRating(1, 1, 1);
	}
}