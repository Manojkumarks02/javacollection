package CollectionFrame;

import java.util.LinkedList;
import java.util.List;

class Book {
	int id;
	String authorName, publisher;
	int quantity;

	public Book(int id, String authorName, String publisher, int quantity) {
		this.id = id;
		this.authorName = authorName;
		this.publisher = publisher;
		this.quantity = quantity;
			
	}
}

public class LinkedList2 {
	public static void main(String[] args) {
		List<Book> l = new LinkedList<Book>();
		
		Book b1 = new Book(1, "sam", "john", 10 );
		Book b2 = new Book(1, " ram", "adan", 20 );
		Book b3 = new Book(1, "joy", "mick", 20 );
		
		l.add(b1);
		l.add(b2);
		l.add(b3);
		
		for(Book b : l) {
			System.out.println((b.id+" "+b.authorName+" "+b.publisher+" "+b.quantity));
		}
		
	}

}
