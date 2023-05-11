package application;

import java.util.Scanner;

import model.Game;
import model.Player;
import model.exceptions.ActionNotValidException;
import model.exceptions.CharacterDoesNotExistsException;

public class TesteJogo {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		
		System.out.println("Insira o nome dos jogadores 1 e 2, respectivos: ");
		
		player1.setName(tc.nextLine());
		player2.setName(tc.nextLine());
		
		
		System.out.println("Escolha seu lutador! (Chun Li, Blanka, Ken ou Ryu)");
		
		try {
			
		player1.selectCharacter(tc.nextLine());
		player2.selectCharacter(tc.nextLine());		
		
		Game game = new Game(player1, player2);
		
		System.out.println(String.format("A luta começou entre: %s e seu personagem %s e %s com seu personagem %s", 
				player1.getName(), player1.getFighter().getName(), player2.getName(), player2.getFighter().getName()));
		
		do {
			System.out.println("Ação do Jogador 1 e 2, respectivamente: ");
			String acao1 = tc.next();
			String acao2 = tc.next();
			game.startGameAction(acao1, acao2);
		} while(player1.getFighter().getLife() > 0 || player2.getFighter().getLife() > 0);
		
		} catch (CharacterDoesNotExistsException e) {
			System.out.println("Personagem não existente!");
		} catch (ActionNotValidException a) {
			System.out.println("Ação não válida do usuário!");		
		} catch (RuntimeException r) {
			System.out.println("Erro não esperado!");
		}
	
		tc.close();

	}
}
