package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Player;
import model.Ryu;
import model.exceptions.CharacterDoesNotExistsException;

public class CharactersTest {
	
	Player player, player2;
	
	@BeforeEach
	void initialize() {
		this.player = new Player();
		this.player2 = new Player();
		player.selectCharacter("Ryu");
		player2.selectCharacter("Ken");
	}

	@Test
	void testCharacterDoesntExists() {
		assertThrows(CharacterDoesNotExistsException.class, () -> player.selectCharacter("teste"));
	}
	
	@Test
	void testCharacterWorking() {
		assertInstanceOf(Ryu.class, player.selectCharacter("Ryu"));
	}
	
	@Test
	void testCharacterAttackDamage() {
		Double attackResult = player2.getFighter().getLife() - player.getFighter().getPower();
		assertEquals(30.8, new BigDecimal(attackResult).setScale(1, RoundingMode.UP).doubleValue());
	}
	
	@Test
	void testCharacterSpecialDamage() {
		Double specialResult = player2.getFighter().getLife() - player.getFighter().getSpecialMove().getValueSpecial();
		assertEquals(23.8, new BigDecimal(specialResult).setScale(1, RoundingMode.UP).doubleValue());
	}
}
