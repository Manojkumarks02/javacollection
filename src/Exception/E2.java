package Exception;

public class E2 {
	public static void main(String[] args) {
		int a = 10;
		int b= 0;
		try {
			int c = a/b;
		} finally {
			System.out.println("finally");
		}
	}

}
