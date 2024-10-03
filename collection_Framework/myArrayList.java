package collection_Framework;
import java.util.*; 

class Book{
	int id;
	String name, Title;
	Book(int id, String name, String Title){
		this.id = id;
		this.name = name;
		this.Title = Title;
	}
}
public record myArrayList() {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(3);
//		list.add(2);
////		System.out.println(list);
//		int x = list.get(1);
//		list.set(0,  1);
//		System.out.println(x);
//		Collections.sort(list);
//		for(Integer a: list) {
//			System.out.println(a);
//		}
//		
//		list.remove(0);
//		for(Integer a: list) {
//			System.out.println(a);
//		}
//		
//		System.out.println(list.isEmpty());
//		System.out.print(list.size());
//		
//		
		
		ArrayList<Book> books = new ArrayList<Book>();
		Book b1 = new Book(1, "Harry", "Tittlies");
		Book b2 = new Book(2, "Harry Potter 2", "Jum Jum");
		Book b3 = new Book(3, "Harry potter 3", "Rum Rum");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
//		System.out.println(books);
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			Book bk = itr.next();
			System.out.println(bk.id + " " + bk.name);
		}
		
	}
	
	
}

