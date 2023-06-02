package Exception;

public class Throws1 {

	static {
		System.out.println("from static p5");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("from p5");
		Class.forName("class.p1");

	}

}
