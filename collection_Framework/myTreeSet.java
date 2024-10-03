package collection_Framework;
import java.util.*; 

public class myTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(89);
		ts.add(10);
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		
		
	}
}
