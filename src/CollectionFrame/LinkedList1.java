package CollectionFrame;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("ram");
		l.add("sam");
		l.add("ray");
		l.add("cook");
		l.add("jason");

		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("------------------------");
		System.out.println(l.removeFirst());
		
		System.out.println("------------------------");
		
		System.out.println(l.lastIndexOf(l));
		
		

	}

}
