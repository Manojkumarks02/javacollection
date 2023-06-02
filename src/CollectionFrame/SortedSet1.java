package CollectionFrame;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<>();
		s.add("BWM");
		s.add("Audi");
		s.add("Benz");
		s.add("Ferrari");
		s.add("lambo");
		 System.out.println(s);
		 
		for(Object object : s) {
			System.out.println(object);
		}
		System.out.println("--------------");
		s.first();
		System.out.println(s.first());
		System.out.println("--------------");
		
		System.out.println(s.last());
		System.out.println("--------------");
		
		System.out.println(s.headSet("Ferarri"));
		System.out.println("--------------");
		
		System.out.println(s.tailSet("lambo"));
		
		
	}

}
