package Ques_11;

public class Myclass {

	private static volatile Myclass singoletonInstance = new Myclass();

	private Myclass() {

	}

	public static Myclass getInstance() {
		return singoletonInstance;

	}
}
