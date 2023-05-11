package model.exceptions;

public class CharacterDoesNotExistsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CharacterDoesNotExistsException(String msg) {
		super(msg);
	}

}
