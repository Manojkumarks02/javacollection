package CollectionFrame;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1); // add elements to arraylist
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		System.out.println(a);

		int secondNumber = a.get(2); // returns the element at specified index
		System.out.println(secondNumber);
		
		
		a.remove(4);
		System.out.println(a);        // removes the element at specified index

		boolean b = a.contains(4);
		System.out.println(b);       // return true if valve is present.
	}

}
