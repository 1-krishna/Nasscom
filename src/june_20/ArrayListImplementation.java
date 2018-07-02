package june_20;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	int quantity;
	String name, author, publisher;
	public Book(int id, String name, String author, String publisher, int quantity){
		this.name = name;
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayListImplementation {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book(101, "Let us C", "yashwant", "Wiley India", 10);
		Book b2 = new Book(102, "HCV", "HCV", "Ramesh House", 8);
		Book b3 = new Book(103, "Chemistry", "DC", "Birju", 3);
		
		list.add(b1);	list.add(b2);	list.add(b3);
		
		for(Book b : list){
			System.out.println(b.name + " Written by " + b.author);
		}
	}

}
