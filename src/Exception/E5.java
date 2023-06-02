package Exception;

public class E5 {
	public static void main(String[] args) {
		System.out.println("from main begin");
		String s = "manoj";
		s.charAt(50);
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
