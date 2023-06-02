package Exception;

import java.util.Scanner;

public class ThrowKeyword {
	static final int mpin = 1999;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Apin");
		int Apin = sc.nextInt();
		if (mpin == Apin) {
			System.out.println("Transaction continuee");

		} else {
			System.out.println("Transaction cancelled");
			throw new NumberFormatException();
		}
	}

}
