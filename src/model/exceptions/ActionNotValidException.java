package model.exceptions;

public class ActionNotValidException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ActionNotValidException(String msg) {
		super(msg);
	}
}
