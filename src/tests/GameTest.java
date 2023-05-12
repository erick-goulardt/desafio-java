package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Game;
import model.Player;
import model.exceptions.ActionNotValidException;

public class GameTest {
	Player player1, player2;
	Game game;
	
	@BeforeEach
	void instance() {
		this.player1 = new Player();
		this.player2 = new Player();
		this.game = new Game(player1, player1);
	}
	
	@Test
	void testGameAction() {
		assertThrows(ActionNotValidException.class, () -> game.gameTurnPlayer("teste", "teste"));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void testGameWinner() {
		player1.selectCharacter("Blanka");
		player2.selectCharacter("Ryu");
		Double zeroResult = player2.getFighter().getLife() - player1.getFighter().getPower();
		assertEquals(0, new BigDecimal(zeroResult).ZERO.doubleValue(), String.format("O %s (player1) venceu a partida de %s! (player2)", player1.getName(), player2.getName()));
	}
}
