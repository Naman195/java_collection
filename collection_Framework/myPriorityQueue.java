package collection_Framework;
import java.util.*;
public class myPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Naman");
		pq.add("Vansh");
		pq.add("Arora");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq);
	}
}
