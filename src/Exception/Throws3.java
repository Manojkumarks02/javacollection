package Exception;

public class Throws3 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Throws3 t3 = new Throws3();

		try {
			t3.show();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public void show() {
		int[] a = {10,20,30,40,50,60};
		
		for(int i =0; i<a.length+1; i++) {
			System.out.println(a[i]);
		}
	}

}
