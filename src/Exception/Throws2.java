package Exception;

public class Throws2 {

	public static int divide(int m, int n) throws ArithmeticException {
		int div = m / n;
		return div;

	}

	public static void main(String[] args) {
		
		System.out.println("main begin");
		Throws2 ob = new Throws2();
		try {
			System.out.println(Throws2.divide(45, 0));

		} catch (ArithmeticException e) {
			System.out.println("num cannot divide by zero");

		}
		System.out.println("main end");
	}
}
