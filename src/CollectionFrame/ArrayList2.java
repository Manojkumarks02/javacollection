package CollectionFrame;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		
		ArrayList< String> arrayList = new ArrayList<>();
		arrayList.add("mahadev");
		arrayList.add("sai");
		arrayList.add("adhi");
		arrayList.add("hanuman");
		arrayList.add("ram");
		System.out.println(arrayList);
		//for loop
		for(int i = 0; i<=4; i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("------------------------------------------");
		
		
		//foreach loop
		for(String string : arrayList )
		{
			System.out.println(string);
		}
	}

}
