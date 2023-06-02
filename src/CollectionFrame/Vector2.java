package CollectionFrame;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		
		System.out.println(v);
		 
		int a = v.remove(3);
		System.out.println(a);
		
		System.out.println("hashcode for v is : "+ v.hashCode());
		
		System.out.println(v.get(5));
	}

}
