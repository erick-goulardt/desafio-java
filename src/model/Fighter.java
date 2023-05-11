package model;

public abstract class Fighter {
	
	private String name;
	private double power;
	private double life;
	private SpecialMove specialMove;
	
	public Fighter(double power, double life, SpecialMove specialMove) {
		this.power = power;
		this.life = life;
		this.specialMove = specialMove;
	}

	public String getName() {
		return this.name;
	}
	
	public double getPower() {
		return this.power;
	}


	public double getLife() {
		return this.life;
	}

	public void setLife(double life) {
		this.life = life;
	}

	public SpecialMove getSpecialMove() {
		return specialMove;
	}

	
	public abstract void attack(Fighter fighter);
	
	public abstract void takeLifeAttack(Fighter fighter);
	
	public abstract void takeLifeSpecial(Fighter fighter);
	
	public abstract void useSpecial(Fighter fighter);
}
