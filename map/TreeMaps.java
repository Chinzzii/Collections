package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> num = new TreeMap<>();
		
		num.put("One", 1);
		num.put("Two", 2);
		num.put("Three", 3);
		num.put("Four", 4);
		num.put("Five", 5);
		
		System.out.println(num);
		
		System.out.println();
		
		num.remove("Two");
		System.out.println(num);
		
		System.out.println();
		
	}

}
