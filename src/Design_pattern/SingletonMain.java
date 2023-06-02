package Design_pattern;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton_EI singleton1 = Singleton_EI.getInstance();
        System.out.println(singleton1.getMessage()); 

        Singleton_EI singleton2 = Singleton_EI.getInstance();
        System.out.println(singleton2.getMessage()); 

        System.out.println(singleton1 == singleton2);
	}

}
