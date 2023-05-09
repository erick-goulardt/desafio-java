package View;

import java.util.Scanner;

public class Game {
	
	private Player player1;
	private Player player2;
	Scanner tc = new Scanner(System.in);
	
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public void startGame() {
		do {
			
			System.out.println("Turno do " + player1.getFighter().getName() + "/ Atacar ou Especial?");
			gameTurn();		

			if(player2.getFighter().getLife() <= 0) {
				System.out.println(String.format("O %s (player1) venceu a partida de %s! (player2)", player1.getName(), player2.getName()));
				break;
			}
			
			System.out.println("Turno do " + player2.getFighter().getName() + "/ Atacar ou Especial?");
			gameTurn();
			
			if(player1.getFighter().getLife() <= 0) {
				System.out.println(String.format("O %s (player2) venceu a partida de %s! (player1)", player2.getName(), player1.getName()));
				break;
			} 
			
			
		} while ((player1.getFighter().getLife() >= 0) || (player2.getFighter().getLife() >= 0));
	}
	
	private void gameTurn() {
		Scanner tc = new Scanner(System.in);
		String flag = tc.nextLine().toLowerCase();
		switch(flag) {
		case "atacar": 
			player1.getFighter().attack(player2.getFighter());
		case "especial":
			player1.getFighter().useSpecial(player2.getFighter());
		}
	}
}
