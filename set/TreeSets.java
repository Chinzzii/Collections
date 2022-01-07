package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(2);
		set.add(10);
		set.add(5);
		set.add(12);
		set.add(15);
		System.out.println(set);
		
		System.out.println();
		
		set.remove(5);
		System.out.println(set);
		
		System.out.println();
		
		System.out.println(set.contains(0));
		System.out.println(set.contains(10));

		System.out.println();
		
		System.out.println(set.isEmpty());
		
		System.out.println();
		
		System.out.println(set.size());
		
		System.out.println();
		
		set.clear();
		System.out.println(set);
		
	}

}
