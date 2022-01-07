package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(1);
		pq.offer(3);
		pq.offer(2);
		pq.offer(4);
		pq.offer(5);
		System.out.println(pq);
		
		System.out.println();
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println();
		
		
	}

}
