package Exception;

public class Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("from main begin");
		Class.forName("ExceptionProgram.p11");
		System.out.println("main end");

	}

}
