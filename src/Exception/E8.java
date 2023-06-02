package Exception;

public class E8 {
	public static void main(String[] args) {
		String s = "manoj";
		try {
			System.out.println("try-1");
			s.charAt(13)
		}
		try {
			System.out.println("try-2");
		}
		try {
			System.out.println("try-3");
		}
		try {
			System.out.println("try-4");
		}
		try {
			System.out.println("try-5");
			
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("catch");
		}
	}

}
