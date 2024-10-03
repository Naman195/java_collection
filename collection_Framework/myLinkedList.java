package collection_Framework;
import java.util.*; 

public class myLinkedList {
	public static void main(String[] args) {
		System.out.println("Hello");
		LinkedList <String> ll1 = new LinkedList<String>();
		ll1.add("Naman");
		ll1.add("Vansh");
		System.out.println(ll1);
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		Integer[] array = list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(array));
	} 
}


