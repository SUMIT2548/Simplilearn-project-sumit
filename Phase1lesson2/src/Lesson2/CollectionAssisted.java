package Lesson2;
import java.util.*;

public class CollectionAssisted {

	public static void main(String[] args) {
		//creating arrylist
		System.out.println("ArryList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Bengalore");
		city.add("kolkata");
		System.out.println(city);
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> a = new Vector<Integer>();
		a.add(15);
		a.add(10);
		System.out.println(a);
		
		//creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("sumit");
		names.add("amit");
		Iterator<String>itr = names.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		
		
		//creating hashset
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(110);
		hash.add(120);
		hash.add(130);
		hash.add(140);
		System.out.println(hash);
		
		//creating linkedhashset
		System.out.println("\n");
		System.out.println("linkedhashset");
		LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
		set.add(11);
		set.add(15);
		set.add(20);
		set.add(25);
		System.out.println(set);
	}
}
	

}
