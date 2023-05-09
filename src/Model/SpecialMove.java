package Model;

public class SpecialMove {
	
	private String name;
	private double valueSpecial;
	
	public SpecialMove(String name, double valueSpecial) {
		this.name = name;
		this.valueSpecial = valueSpecial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValueSpecial() {
		return valueSpecial;
	}

	public void setValueSpecial(double valueSpecial) {
		this.valueSpecial = valueSpecial;
	}

}