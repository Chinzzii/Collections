package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> roll = new ArrayList<>();
		
		//increases size by n = n + n/2 + 1
		
		roll.add(1);
		roll.add(2);
		roll.add(3);
		System.out.println(roll);
		
		System.out.println();
		
		roll.add(0, 0);
		System.out.println(roll);
		
		System.out.println();
		
		ArrayList<Integer> newRoll = new ArrayList<>();
		newRoll.add(4);
		newRoll.add(5);
		roll.addAll(newRoll);
		System.out.println(roll);
		
		System.out.println();
		
		System.out.println(roll.get(2));
		
		System.out.println();
		
		roll.remove(0);
		System.out.println(roll);
		
		System.out.println();
		
		roll.remove(Integer.valueOf(5));
		System.out.println(roll);
		
		System.out.println();
		
		roll.set(3, 5);
		System.out.println(roll);
		
		System.out.println();
		
		System.out.println(roll.contains(4));
		
		System.out.println();
		
		for(Integer e: roll) {
			System.out.print(e*e + " ");
		}
		System.out.println();
		
		System.out.println();
		
		Iterator<Integer> it = roll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		System.out.println();
		
		roll.clear();
		System.out.println(roll);
		
	}

}
