package CollectionFrame;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "mango");
		t.put(2, "apple");
		t.put(3, "grapes");
		t.put(4, "kiwi");
		t.put(5, "oranges");

		System.out.println(t);
		for (Map.Entry m : t.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("===============================");

		System.out.println(t.descendingKeySet());
		System.out.println("===============================");

		System.out.println("head Map :" + t.headMap(4));
		System.out.println("===============================");
		
		System.out.println("tail Map :" + t.tailMap(3));
		
		
		
	}

}
