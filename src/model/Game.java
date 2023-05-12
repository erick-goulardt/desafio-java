package model;

import model.exceptions.ActionNotValidException;

public class Game {
	
	private Player player1;
	private Player player2;
	
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
	
	public void startGameAction(String movementPlayer1, String movementPlayer2) {
			gameTurnPlayer(movementPlayer1, movementPlayer2);		
			System.out.println(String.format("A vida atual do %s é de: %.1f", player2.getFighter().getName(), player2.getFighter().getLife()));
			System.out.println(String.format("A vida atual do " + player1.getFighter().getName() + " é de: %.1f", player1.getFighter().getLife()));
			
			if(player2.getFighter().getLife() <= 0) {
				System.out.println(String.format("O %s (player1) venceu a partida de %s! (player2)", player1.getName(), player2.getName()));
			}
			
			if(player1.getFighter().getLife() <= 0) {
				System.out.println(String.format("O %s (player2) venceu a partida de %s! (player1)", player2.getName(), player1.getName()));
			} 
	}
	
	
	public void gameTurnPlayer(String movementPlayer1, String movementPlayer2) {
		if(movementPlayer1.equalsIgnoreCase("atacar")) {
			player1.getFighter().attack(player2.getFighter());
		} else if (movementPlayer1.equalsIgnoreCase("especial")) {
			player1.getFighter().useSpecial(player2.getFighter());
		} else {
			throw new ActionNotValidException("Ação Inválida do Jogador 1");
		}
		
		if(movementPlayer2.equalsIgnoreCase("atacar")) {
			player2.getFighter().attack(player1.getFighter());
		} else if (movementPlayer2.equalsIgnoreCase("especial")) {
			player2.getFighter().useSpecial(player1.getFighter());
		} else {
			throw new ActionNotValidException("Ação Inválida do Jogador 2");
		}
	}
	
}

