package Model;

public class Chun_Li extends Fighter {
	
	private final String name = "Chun-Li";

	public Chun_Li(double power, double life, SpecialMove specialMove) {
		super(power, life, specialMove);
		
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void attack(Fighter fighter) {
		takeLifeAttack(fighter);
		                            
	}

	@Override
	public void takeLifeAttack(Fighter fighter) {
		fighter.setLife(fighter.getLife() - this.getPower());
	}
	
	@Override
	public void takeLifeSpecial(Fighter fighter) {
		fighter.setLife(fighter.getLife() - this.getSpecialMove().getValueSpecial());
	}

	@Override
	public void useSpecial(Fighter fighter) {
		takeLifeSpecial(fighter);
	}

}


