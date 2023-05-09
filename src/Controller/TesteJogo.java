package Controller;

import View.*;

public class TesteJogo {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("Erick");
		player2.setName("Joao");
		
		player1.selectCharacter("Ryu");
		player2.selectCharacter("Ken");
		
		Game game = new Game(player1, player2);
		game.startGame();
		
	}
}
