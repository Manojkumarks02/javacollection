package CollectionFrame;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "mango");
		h.put(2, "apple");
		h.put(3, "grapes");
		h.put(4, "orange");
		h.put(1, "kiwi");

		System.out.println(h);
		System.out.println("-------------------");

		for (Map.Entry m : h.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("-------------------");

		System.out.println("after put absent");
		h.putIfAbsent(5, "pineapple");
		for (Map.Entry m : h.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("-------------------");

	}

}
