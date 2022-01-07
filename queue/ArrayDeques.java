package queue;

import java.util.ArrayDeque;

public class ArrayDeques {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adeq = new ArrayDeque<>();
		
		adeq.offer(1);
		adeq.offerFirst(0);
		adeq.offerLast(2);
		adeq.offer(3);
		System.out.println(adeq);
		
		System.out.println();
		
		System.out.println(adeq.peek());
		System.out.println(adeq.peekFirst());
		System.out.println(adeq.peekLast());
		
		System.out.println();
		
		System.out.println(adeq.poll());
		System.out.println(adeq);
		System.out.println(adeq.pollFirst());
		System.out.println(adeq);
		System.out.println(adeq.pollLast());
		System.out.println(adeq);
		
		System.out.println();
	}

}
