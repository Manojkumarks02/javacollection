package CollectionFrame;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("bmw");
		t.add("benz");
		t.add("ferrari");
		t.add("lambo");

		System.out.println(t);
		System.out.println("------------------");
		Iterator<String> itr = t.descendingIterator();
		System.out.println(itr);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------");
		
		t.pollFirst();
		System.out.println(t.pollFirst());
		System.out.println("------------------");
		
		System.out.println(t.pollLast());
		System.out.println("------------------");
	}

}
