package collection_Framework;
import java.util.*;

class Student implements Comparable<Student> {  
	public String name;
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student person) {
		return Integer.compare(this.age, person.age);
	}
	
}


public class userDefinedSort {
	public static void main(String[] args) {
		ArrayList<Student> lst = new ArrayList<Student>();
		lst.add(new Student("naman", 22));
		lst.add(new Student("aman", 23));
		lst.add(new Student("namen", 21));
		Collections.sort(lst);
		for(Student s: lst) {
			System.out.println(s.name);
		}
	}
} 
