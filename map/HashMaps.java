package map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> num = new HashMap<>();
		
		num.put(1, "One");
		num.put(2, "Two");
		num.put(3, "Teen");
		System.out.println(num);
		
		System.out.println();
		
		num.put(3, "Three");
		System.out.println(num);
		
		System.out.println();
		
		if(!num.containsKey(3)) {
			num.put(3, "Teen");
		}
		num.putIfAbsent(3, "Teen");
		System.out.println(num);
		
		System.out.println();
		
		for(Map.Entry<Integer, String> e: num.entrySet()) {
			System.out.println(e);
			System.out.print(e.getKey() + " " + e.getValue());
			System.out.println();
		}
		
		System.out.println();
		
		for(Integer k: num.keySet()) {
			System.out.print(k + " ");
		}
		System.out.println();
		for(String val: num.values()) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(num.containsKey(4));
		System.out.println(num.containsValue("Two"));
		
		
	}

}
