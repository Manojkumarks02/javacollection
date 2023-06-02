package Design_pattern;

public class SingletonClass implements Cloneable {
	private static SingletonClass class1;

	private SingletonClass() {

	}

	public synchronized static SingletonClass getInstance() {
		if (class1 == null) {
			class1 = new SingletonClass();

		}
		return class1;

	}

	public Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("Clone Not Support");

	}
}
