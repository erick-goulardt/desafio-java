package View;
import Model.*;

public class Player {
	
	private String name;
	private Fighter fighter;
	
	public Player() {
		
	}
	
	public Player(String name, Fighter fighter) {
		this.name = name;
		this.fighter = fighter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}
	
	public Fighter selectCharacter(String nameFighter) {
		switch(nameFighter) {
			case "Ryu":
				this.fighter = new Ryu(6.0, 34.0, new SpecialMove("Hadouken", 13.0));
				break;
			case "Ken":
				this.fighter = new Ken(5.4, 36.8, new SpecialMove("Shooryuken", 11.0));
				break;
			case "Blanka":
				this.fighter = new Blanka(99.9, 99.9, new SpecialMove("Electric Thunder", 1000.00));
				break;
			case "Chun-Li":
				this.fighter = new Chun_Li(7.1, 28.4, new SpecialMove("Kikoken", 14.0));
		}
		
		return fighter;
	}
		
}
	
