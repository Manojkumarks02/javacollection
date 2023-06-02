package Exception;

import java.io.IOException;

public class E7 {
	public static void main(String[] args) {
		System.out.println("Main begins");
		String s = "manoj";
		try {
			System.out.println("try begins");
			s.charAt(10);
		} catch (ArithmeticException e) {
			System.out.println("catch-1");
			System.out.println(e);

		} catch (NumberFormatException e) {
			System.out.println("catch-2");
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch-3");
			System.out.println(e);

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("catch-4");
			System.out.println(e);
		}

	}

}
