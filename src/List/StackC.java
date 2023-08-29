package List;

import java.util.Stack;

public class StackC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack=new Stack<String>();
		
		stack.push("A");
		stack.push("B");
		stack.add("C");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.contains("C"));
		System.out.println(stack.capacity());
		System.out.println(stack.search("B"));

	}

}
