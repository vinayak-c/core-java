package Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* //stack implementation of ArrayDeque
		ArrayDeque<String> stackArray=new ArrayDeque<>();

		stackArray.push("a");
		stackArray.push("b");
		stackArray.push("c");
		stackArray.push("k");
		stackArray.push("z");
		System.out.println(stackArray);
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.isEmpty());
		System.out.println(stackArray.peekFirst());
		
		for(String s:stackArray)
		{
			System.out.println("value of stack: "+s);
		}
		
		Iterator<String> st=stackArray.iterator();
		while(st.hasNext())
		{
			System.out.println(st.next());
		} */
		
		//dequeue implementation of ArrayDeque
		
		ArrayDeque<String> dequeArray=new ArrayDeque<>();
		
		dequeArray.offerFirst("a");
		dequeArray.offerFirst("b");
		dequeArray.offerFirst("c");
		dequeArray.offerFirst("d");
		dequeArray.offerLast("z");
		dequeArray.offerLast("y");
		dequeArray.offerLast("x");
		
		System.out.println(dequeArray);
		
		System.out.println(dequeArray.peekFirst());
		System.out.println(dequeArray.peekLast());
		System.out.println(dequeArray.pollFirst());
		System.out.println(dequeArray.pollLast());
		
		System.out.println(dequeArray);
		
		
	}

}
