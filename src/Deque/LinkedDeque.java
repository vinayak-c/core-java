package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedDeque {

	public static void main(String[] args) {
		
		Deque<Integer> ld=new LinkedList<>();
		
		ld.offerFirst(1);
		ld.offerFirst(2);
		ld.offerFirst(4);
		ld.offerFirst(6);
		ld.offerFirst(3);
		ld.offerFirst(10);
		ld.offerFirst(9);
		ld.offerLast(12);
		ld.offerLast(15);
		System.out.println(ld);
		System.out.println(ld.pollFirst());
		System.out.println(ld.pollLast());
		System.out.println(ld.peekFirst());
		System.out.println(ld.peekLast());
	}

}
