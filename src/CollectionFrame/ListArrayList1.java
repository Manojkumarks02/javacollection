package CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("ram");
		a.add("sai");
		a.add("adi");
		a.add("maha");
		System.out.println(a);

		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
