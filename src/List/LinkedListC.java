package List;

import java.util.*;

public class LinkedListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> c = new LinkedList<String>();
		c.addFirst("1");
		LinkedList<String> l=new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		l.add("G");
		l.push("H");
		System.out.println(l.pop());
		System.out.println(l.poll());
		System.out.println(l);
		/*System.out.println(l.isEmpty());
		System.out.println(l.contains("A"));
		l.set(3,"z");
		System.out.println(l);
		List<String> l2= l.subList(0,3);
		System.out.println(l2);
		l.addFirst("1");
		l.addLast("2");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.offerFirst("10");
		System.out.println(l);
		l.pollFirst();
		System.out.println(l);*/
		
	}

}
