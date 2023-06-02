package CollectionFrame;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap< Integer, String > l = new LinkedHashMap<>();
		l.put(1, "mango");
		l.put(2, "apple");
		l.put(3, "grapes");
		l.put(4, "orange");
		l.put(5, "kiwi");
			
		l.forEach((key, value) -> System.out.println(key + "->" + value));
		
		
	}

}
