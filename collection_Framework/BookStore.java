package collection_Framework;
import java.util.*;
class Book1{
	int id;
	String author, name, publisher;
	int quantity;
	
	Book1(int id, String name, String author, String publisher, int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		
	}
	
	
}
public class BookStore {
	
	
	
	public static void main(String[] args) {
		HashMap<Integer, Book1> map = new HashMap<Integer,Book1>();
		
		Book1 b1 = new Book1(1, "Atomic Habits", "Naman", "Arora", 500);
		Book1 b2 = new Book1(2, "No Pain No Gain", "Ankur", "Warikoo", 700);
		Book1 b3 = new Book1(3, "Dreams Come True", "Raj", "Malhotra", 400);
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
//		System.out.println(map.entrySet());
		for(Map.Entry<Integer, Book1> entry: map.entrySet()) {
			int key = entry.getKey();
			Book1 a = entry.getValue();
			System.out.println(key + " " +  "Details");
			System.out.println(a.id + " " + a.name + " " + a.author + " " + a.publisher + " " + a.quantity);
			
		}
		
	}
}
