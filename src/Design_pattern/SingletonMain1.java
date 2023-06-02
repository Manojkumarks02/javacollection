package Design_pattern;

public class SingletonMain1 {
	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getInstance();
		System.out.println(singleton1.getMessage());
		
		Singleton1 singleton2 = Singleton1.getInstance();
		System.out.println(singleton2.getMessage());
		
		System.out.println( singleton1 == singleton2);
	}

}
