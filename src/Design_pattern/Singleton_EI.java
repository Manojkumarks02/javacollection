package Design_pattern;

public class Singleton_EI {
	private static Singleton_EI instance = new Singleton_EI();
	private String message;

	private Singleton_EI() {
		message = "hello manoj";
      }
     public static Singleton_EI getInstance() {
			return instance;
    	 }
     public String getMessage() {
		return message;
    	 
     }
}
