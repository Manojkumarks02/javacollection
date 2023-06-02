package Design_pattern;

public class Singleton1 {
	private static Singleton1 instance;
	private String message;

	private Singleton1() {
		message = "hello raju";
	}

	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();

		}
		return instance;

	}
	
	public String getMessage() {
		return message;
		
	}
}
