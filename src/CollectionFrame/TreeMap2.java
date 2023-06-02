package CollectionFrame;

import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Apple", 10);
		treeMap.put("Banana", 5);
		treeMap.put("Orange", 8);

		treeMap.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	    System.out.println("=========================");
		
		int sum = treeMap.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of values: " + sum);
	}

}
