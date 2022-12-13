package LambdaExpression;

public class AgeInValidException extends Exception {
	
	String message;

	public AgeInValidException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
