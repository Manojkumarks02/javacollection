package CollectionFrame;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("apple");
		s.push("mango");
		s.push("grapes");
		s.push("orange");
		
		System.out.println("stack : "+ s);
		System.out.println(s.isEmpty());  //isEmpty()
		
		s.pop();
		System.out.println(s);
		
		String fruits = s.peek();
		System.out.println("Element at top : "+ fruits);
		
		int location = s.search("apple");
		System.out.println("Location of grapes : "+ location);
		
	}

}
