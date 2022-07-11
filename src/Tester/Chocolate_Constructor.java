package Tester;

public class Chocolate_Constructor {
	private int barCode;
	private String name;
	private int weight;
	private int cost;

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Chocolate_Constructor(int barCode, String name, int weight, int cost) {
		super();
		this.barCode = barCode;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Chocolate_Constructor [barCode=" + barCode + ", name=" + name + ", weight=" + weight + ", cost=" + cost
				+ "]";
	}

	public static void main(String[] args) {
		Chocolate_Constructor chocolate_Constructor=new Chocolate_Constructor(101,"cadburry",12,10);
		System.out.println(chocolate_Constructor.toString());

		chocolate_Constructor.setBarCode(102);
		chocolate_Constructor.setCost(50);
		chocolate_Constructor.setName("Hershey's");
		chocolate_Constructor.setWeight(24);
		System.out.println(chocolate_Constructor.toString());

	}

}
