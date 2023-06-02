package Exception;

public class E3 {
	public static void main(String[] args) {
		int a = 13;
		int b = 11;
		try {
			System.out.println("try");
			int c = 10;
		}
		finally {
			System.out.println("finally");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("catch");
		}
	}

}
